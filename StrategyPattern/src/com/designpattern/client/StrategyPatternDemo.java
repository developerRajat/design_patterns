package com.designpattern.client;

import java.io.File;
import java.util.ArrayList;

import com.designpattern.context.CompressionContext;
import com.designpattern.strategy.RarCompression;
import com.designpattern.strategy.ZipCompression;

public class StrategyPatternDemo {
	
	public static void main(String[] ar) {
		CompressionContext context = new CompressionContext();
		context.setStrategy(new ZipCompression());
		context.createArchive(new ArrayList<File>());
		
		context.setStrategy(new RarCompression());
		context.createArchive(new ArrayList<File>());
	}
}
