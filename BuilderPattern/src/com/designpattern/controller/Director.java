package com.designpattern.controller;

import com.designpattern.builders.AircraftBuilder;

public class Director {
	
	AircraftBuilder aircraftBuilder;

	public Director(AircraftBuilder aircraftBuilder) {
		this.aircraftBuilder = aircraftBuilder;
	};
	
	
	
	public AircraftBuilder getAircraftBuilder() {
		return aircraftBuilder;
	}



	public void setAircraftBuilder(AircraftBuilder aircraftBuilder) {
		this.aircraftBuilder = aircraftBuilder;
	}



	public void construct(boolean isBathroom) {
		aircraftBuilder.buildCockfit();
		aircraftBuilder.buildEngine();
		aircraftBuilder.buildWings();
		
		if(isBathroom) {
			aircraftBuilder.buildBathroom();
		}
	}
	

}
