package com.designpattern.client;

import com.designpattern.commands.Command;
import com.designpattern.commands.FanOffCommand;
import com.designpattern.commands.FanOnCommand;
import com.designpattern.commands.LightsOffCommand;
import com.designpattern.commands.LightsOnCommand;
import com.designpattern.controller.RemoteControl;
import com.designpattern.receiver.Fan;
import com.designpattern.receiver.Light;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Light light = new Light();
		Fan fan  = new Fan();
		Command lightsOn = new LightsOnCommand(light);
		Command lightsOff = new LightsOffCommand(light);
		
		Command fanOn = new FanOnCommand(fan);
		Command fanOff = new FanOffCommand(fan);
		
		RemoteControl remote = new RemoteControl();
		remote.setCommand(lightsOn);
		remote.pressButtonListener();
		
		remote.setCommand(lightsOff);
		remote.pressButtonListener();
		
		remote.setCommand(fanOn);
		remote.pressButtonListener();
		
		remote.setCommand(fanOff);
		remote.pressButtonListener();
				
	}

}
