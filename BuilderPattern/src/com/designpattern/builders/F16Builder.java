package com.designpattern.builders;

import com.designpattern.product.F16;
import com.designpattern.product.IAirCraft;

public class F16Builder extends AircraftBuilder{
	
	F16 f16;
	
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
	public IAirCraft getProduct() {
		return f16;
	}

}
