package com.designpattern.commands;

import com.designpattern.receiver.Fan;

public class FanOffCommand implements Command {

	Fan fan;
	
	public FanOffCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.switchOff();
		System.out.println("Switch off the fan...");
	}

}
