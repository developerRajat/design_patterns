package com.designpattern.controller;

import com.designpattern.commands.Command;

public class RemoteControl {
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButtonListener() {
		command.execute();
	}
}
