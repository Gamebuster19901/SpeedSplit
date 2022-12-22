package com.gamebuster19901.speedsplit;

import java.awt.image.BufferedImage;
import java.time.Instant;
import java.util.LinkedHashSet;

public interface Matchable {
	public float getSimilarity(BufferedImage image);
	public float getThreshold();
	public default boolean matches(BufferedImage image) {
		return getSimilarity(image) >= getThreshold();
	}
	/**
	 * @return the cooldown time in milliseconds
	 */
	public int getCooldown();
	public Instant getLastMatch();
	public BufferedImage getImage();
	public LinkedHashSet<Integer> getPresses();
}
