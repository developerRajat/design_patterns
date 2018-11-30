package com.designpattern.context;

import java.io.File;
import java.util.ArrayList;

import com.designpattern.strategy.CompressionStrategy;

public class CompressionContext {
	CompressionStrategy strategy;
	
	// set the strategy at runtime
	public void setStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}
	
	// use the strategy
	public void createArchive(ArrayList<File> files) {
		strategy.compressFiles(files);
	}
}
