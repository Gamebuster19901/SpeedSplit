package com.gamebuster19901.speedsplit;

import org.apache.commons.lang3.SystemUtils;

public enum OperatingSystem {
	LINUX,
	MAC,
	WINDOWS,
	UNKNOWN;
	
	public static OperatingSystem getOperatingSystem() {
		if(SystemUtils.IS_OS_LINUX) {
			return LINUX;
		}
		if(SystemUtils.IS_OS_MAC) {
			return MAC;
		}
		if(SystemUtils.IS_OS_WINDOWS) {
			return WINDOWS;
		}
		return UNKNOWN;
	}
}
