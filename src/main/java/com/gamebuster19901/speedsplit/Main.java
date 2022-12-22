package com.gamebuster19901.speedsplit;

import org.bytedeco.javacv.FrameGrabber;

public class Main {

	public static void main(String args[]) throws FrameGrabber.Exception, InterruptedException {
		MainWindow mainWindow = new MainWindow(args);
		MainWindow.exitLock.lock();
	}
	
}
