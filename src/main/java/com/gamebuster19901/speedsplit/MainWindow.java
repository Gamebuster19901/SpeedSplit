package com.gamebuster19901.speedsplit;

import java.awt.Canvas;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.FFmpegLogCallback;
import org.bytedeco.javacv.FrameGrabber;

public class MainWindow implements AutoCloseable {

	public static final ReentrantLock exitLock = new ReentrantLock();
	public static final File lastRoute = new File("./lastRoute");
	
	FrameGrabber grabber;
	CanvasFrame canvasFrame;
	Route route;
	
	public MainWindow(String... args) {
		if(lastRoute.exists()) {
			try(
				BufferedReader reader = new BufferedReader(new FileReader(lastRoute));
			) {
				route = new Route(reader.readLine());
			}
			catch (Throwable t){
				t.printStackTrace();
			}
		}
		if(route == null) {
			route = new Route("New Route");
		}
		
        FFmpegLogCallback.set();
        
        canvasFrame = new CanvasFrame("Screen Capture", 1);
        JFrame frame = new JFrame("SpeedSplit");
        JPanel panel = new JPanel();
        
        GridBagConstraints c = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        layout.rowHeights.
        
        panel.setBounds(0, 0, 1000, 1000);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = canvasFrame.getCanvas();
        panel.add(canvas);
        
        frame.setVisible(true);
        canvasFrame.setVisible(false);
        startGrabberVideoThread();
	}
	
	private void startGrabberVideoThread() {
		new Thread(() -> {
			Instant now = Instant.now();
			Instant nextSecond = now.plus(Duration.ofSeconds(1));
			int i = 0;
			int errs = 0;
	        while (exitLock.isLocked()) {
	        	try {
	        		setupGrabber(false);
		        	now = Instant.now();
		            if(now.isAfter(nextSecond)) {
		            	nextSecond = now.plus(Duration.ofSeconds(1));
		            	System.out.println("FPS: " + i);
		            	i = 0;
		            }
		            canvasFrame.showImage(grabber.grab());
		            i++;
	        	}
	        	catch(Throwable t) {
	        		if(errs++ < 10) {
	        			t.printStackTrace();
	        		}
	        	}
	        }
		}).start();
	}

	public void setupGrabber(boolean force) throws Exception {
		if(grabber == null || force) {
			grabber = route.options().getNewGrabber();
			grabber.start();
		}
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}
