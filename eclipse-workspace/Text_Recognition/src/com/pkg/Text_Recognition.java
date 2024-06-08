package com.pkg;

import org.opencv.core.Core;

public class Text_Recognition {
	
	public static void main(String[] args)
	{
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		System.out.println("loaded");
	}

}