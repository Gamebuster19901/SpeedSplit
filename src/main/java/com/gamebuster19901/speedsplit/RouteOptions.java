package com.gamebuster19901.speedsplit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.FrameGrabber;

public record RouteOptions(int x, int y, int w, int h, String frameGrabber, String grabberFormat, int frameRate,  ArrayList<Matchable> splits) {

	public static final File DEFAULT_OPTIONS = new File("./defaultOptions");
	
	public RouteOptions(File file) throws IOException {
		this(new BufferedReader(new FileReader(file)));
	}
	
	public RouteOptions(BufferedReader reader) throws IOException {
		this(
			Integer.parseInt(reader.readLine()), //x
			Integer.parseInt(reader.readLine()), //y
			Integer.parseInt(reader.readLine()), //w
			Integer.parseInt(reader.readLine()), //h
			reader.readLine(),					 //frameGrabber
			reader.readLine(),					 //grabberFormat
			Integer.parseInt(reader.readLine()), //frameRate
			new ArrayList<>()					 //splits
		);
		reader.close();
	}
	
	public FrameGrabber getNewGrabber() {
		final OperatingSystem os = OperatingSystem.getOperatingSystem();
		final FFmpegFrameGrabber grabber;
		switch(os) {
		  case LINUX:
		  case MAC:
			  grabber = new FFmpegFrameGrabber(frameGrabber + x + "," + y);
			  break;
		  default:
			  grabber = new FFmpegFrameGrabber(frameGrabber);
		}
		grabber.setImageWidth(w);
		grabber.setImageHeight(h);
		grabber.setFormat(grabberFormat);
		grabber.setFrameRate(frameRate);
		return grabber;
	}
	
	public static RouteOptions getDefaultOptions() {
		OperatingSystem os = OperatingSystem.getOperatingSystem();
		if(DEFAULT_OPTIONS.exists()) {
			try {
				return new RouteOptions(DEFAULT_OPTIONS);
			} catch (Throwable t) {
				t.printStackTrace(); //yikes, we have to use hard the coded options below instead
			}
		}
		switch(os) {
			case LINUX:
			case MAC:
				return new RouteOptions(1920, 500, 500, 500, ":1.0+", "x11grab", 60, new ArrayList<>());
			default:
				return new RouteOptions(0, 0, 500, 500, "", "", 60, new ArrayList<>());
		}
	}

}
