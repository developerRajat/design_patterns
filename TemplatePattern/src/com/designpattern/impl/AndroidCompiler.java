package com.designpattern.impl;

import com.designpattern.template.CrossCompiler;

public class AndroidCompiler extends CrossCompiler {

	@Override
	protected void collectSource() {
		System.out.println("Android: Collecting source code...");
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Android: Compiling source code...");
	}

}
