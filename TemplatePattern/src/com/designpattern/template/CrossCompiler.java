package com.designpattern.template;

public abstract class CrossCompiler {
	//Template method
	public final void crossCompile() {
		collectSource();
		compileToTarget();
	}
	
	//abstract methods
	protected abstract void collectSource();
	protected abstract void compileToTarget();
	
}
