package com.gamebuster19901.speedsplit;

import java.io.File;

public record Route(String name, RouteOptions options) {
	
	public Route(String name) {
		this(name, new File(name));
	}

	public Route(String name, File file) {
		this(name, getRouteOptions(file));
	}
	
	private static final RouteOptions getRouteOptions(File file) {
		if(file.exists()) {
			
		}
		return RouteOptions.getDefaultOptions();
	}
	
}