package com.runtime;

import java.io.IOException;

public class Test {
	public static void main(String args[]) throws IOException {
		Runtime runtime=Runtime.getRuntime();
		Runtime runtime1=Runtime.getRuntime();
		
		System.out.println(runtime==runtime1);
		System.out.println(runtime);
		System.out.println(runtime1);
		
		System.out.println(runtime1.hashCode());
		System.out.println(runtime.hashCode());
		
		
		System.out.println(runtime.availableProcessors());
		System.out.println(runtime.freeMemory());
		
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.totalMemory());
		
		System.out.println(runtime.exec("notepad"));
		System.out.println(runtime.exec("mspaint"));
		
		System.out.println(runtime.exec("calc"));
		
		
	}

}
