package com.designpattern.client;

import com.designpattern.builders.AircraftBuilder;
import com.designpattern.builders.Boeing747Builder;
import com.designpattern.builders.F16Builder;
import com.designpattern.controller.Director;
import com.designpattern.product.IAirCraft;

public class Client {
	
	public static void main(String []ar) {
		AircraftBuilder f16Builder = new F16Builder();
		Director director = new Director(f16Builder);
		director.construct(false);
		
		IAirCraft f16 = f16Builder.getProduct();
		
		AircraftBuilder boeingBuilder = new Boeing747Builder();
		director.setAircraftBuilder(boeingBuilder);
		director.construct(true);
		
		IAirCraft boeing747 = boeingBuilder.getProduct();
	}

}
