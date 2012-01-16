package ully.designpattern.singleton.lazy;

/**
 * @author lihan01
 *
 */
public class DoubleCheckSingleton {
	/**
	 * Volatile修饰的成员变量在每次被线程访问时，
	 * 都强迫从共享内存中重读该成员变量的值。
	 * 而且，当成员变量发生变化时，强迫线程将变化值回写到共享内存。
	 * 这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
	 * http://developer.51cto.com/art/201105/264855.htm
	 */
	private volatile static DoubleCheckSingleton singleton; //volatile 可以
	private int count; 
	
	public static DoubleCheckSingleton getInstance(){
		if(singleton == null) {
			synchronized(DoubleCheckSingleton.class) {
				if(singleton == null) 
				{
					System.out.println("lazy init...");
					singleton = new DoubleCheckSingleton();
				}
			}
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
