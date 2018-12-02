package com.designpattern.impl;

import com.designpattern.template.CrossCompiler;

public class IphoneCompiler extends CrossCompiler{

	@Override
	protected void collectSource() {
		System.out.println("Iphone: Collecting source code...");
		
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Iphone: Compiling source code...");
	}
	
}
