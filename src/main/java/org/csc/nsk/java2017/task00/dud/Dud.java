/*
 * Task 00
 * CSC Java 2017
 * Created by frikadelki on 2017/9/21
 */

package org.csc.nsk.java2017.task00.dud;


public final class Dud {
	public enum Flavor {
		LEFT,
		RIGHT,
		STRANGE,
		;
	}

	private final Flavor flavor;
	private final int count;

	public Dud(final Flavor flavor, final int count) {
		this.flavor = flavor;
		this.count = count;
	}
}
