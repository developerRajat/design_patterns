package com.designpattern.strategy;

import java.io.File;
import java.util.ArrayList;

public class ZipCompression implements CompressionStrategy {

	@Override
	public void compressFiles(ArrayList<File> files) {
		System.out.println("Applying zip compression strategy...");
	}

}
