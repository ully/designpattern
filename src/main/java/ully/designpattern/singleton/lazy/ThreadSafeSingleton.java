package ully.designpattern.singleton.lazy;

/**
 * 由于直接在整个方法加锁，一方面能保证线程安全，但由于
 * 粒度太粗，会影响并发性能
 * @author lihan01
 *
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton singleton;
	private int count; 
	
	public synchronized static ThreadSafeSingleton getInstance(){
		if(singleton == null) {
			System.out.println("lazy init...");
			singleton = new ThreadSafeSingleton();
		}
		
		return singleton;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
