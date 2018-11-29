package com.designpattern.receiver;

public class Light {
	boolean on;
	
	public void switchOn() {
		this.on = true;
		System.out.println("Switch on the light...");
	}
	
	public void switchOff() {
		this.on = false;
		System.out.println("Switch off the light...");
	}
}
