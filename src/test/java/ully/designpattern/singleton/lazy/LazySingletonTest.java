package ully.designpattern.singleton.lazy;

import org.junit.Assert;
import org.junit.Test;

public class LazySingletonTest {

	@Test
	public void testSingleton(){
		UnThreadSafeSingleton singleton = UnThreadSafeSingleton.getInstance();
		singleton.setCount(10);
		UnThreadSafeSingleton singleton1 = UnThreadSafeSingleton.getInstance();
		Assert.assertEquals(10, singleton1.getCount());
	}
	
	@Test
	public void testDoubleCheckSingleton() {
		ThreadDemo td = new ThreadDemo();  
		Thread t1 = new Thread(td,"thread-1");
		Thread t2 = new Thread(td,"thread-2");
		t1.start();
		t2.start();
	}
	
	@Test
	public void testLazyLoadedSingleton(){
		LazyLoadedSingleton singleton = LazyLoadedSingleton.getInstance();
		singleton.setCount(10);
		LazyLoadedSingleton singleton1 = LazyLoadedSingleton.getInstance();
		Assert.assertEquals(10, singleton1.getCount());
	}
}
