package ully.designpattern.singleton.lazy;

public class ThreadDemo implements Runnable{

	public void run() {
		String currentThreadName = Thread.currentThread().getName();  
		System.out.println(currentThreadName + "init singleton");
		DoubleCheckSingleton singleton = DoubleCheckSingleton.getInstance();
	}

}
