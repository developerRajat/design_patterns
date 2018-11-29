package com.designpattern.commands;

import com.designpattern.receiver.Light;

public class LightsOnCommand implements Command{

	Light light;
	
	public LightsOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.switchOn();
	}

}
