package com.designpattern.builders;

import com.designpattern.product.IAirCraft;

public abstract class AircraftBuilder {
	
	public void buildCockfit() {
	}
	
	public void buildEngine() {
	}
	
	public void buildWings() {
	}
	
	public void buildBathroom() {
	}
	
	public abstract IAirCraft getProduct();
	
}
