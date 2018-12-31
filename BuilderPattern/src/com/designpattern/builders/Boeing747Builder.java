package com.designpattern.builders;

import com.designpattern.product.Boeing747;
import com.designpattern.product.IAirCraft;

public class Boeing747Builder extends AircraftBuilder {
	
	Boeing747 boeing747;
	
	@Override
	public void buildCockfit() {
	}
	
	@Override
	public void buildEngine() {
	}
	
	@Override
	public void buildWings() {
	}
	
	@Override
	public void buildBathroom() {
	}

	@Override
	public IAirCraft getProduct() {
		return boeing747;
	}

}
