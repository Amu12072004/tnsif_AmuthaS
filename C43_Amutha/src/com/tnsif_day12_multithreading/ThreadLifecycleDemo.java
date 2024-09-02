package com.tnsif_day12_multithreading;

import com.tnsif_day11.threadandmultithread.myChildThread;

public class ThreadLifecycleDemo {

public static void main(String args[]) {
	myChildThread myThread=new myChildThread();
	System.out.println("Before runable stage thread"+"is alive or not"+myThread.isAlive());
	myThread.start();
	try {
		Thread.sleep(4000);
	}
	catch(InterruptedException exp) {
		
	}
	
	
}

}
