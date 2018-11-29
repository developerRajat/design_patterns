package com.designpattern.commands;

import com.designpattern.receiver.Fan;

public class FanOnCommand implements Command {

	Fan fan;
	
	public FanOnCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.switchOn();
		System.out.println("Switch on the fan...");
	}

}
