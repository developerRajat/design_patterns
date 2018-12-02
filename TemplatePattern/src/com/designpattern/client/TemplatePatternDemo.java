package com.designpattern.client;

import com.designpattern.impl.AndroidCompiler;
import com.designpattern.impl.IphoneCompiler;
import com.designpattern.template.CrossCompiler;

public class TemplatePatternDemo {
	public static void main(String[] ar) {
		CrossCompiler iphone = new IphoneCompiler();
		iphone.crossCompile();
		
		CrossCompiler android = new AndroidCompiler();
		android.crossCompile();
	}
}
