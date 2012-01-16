package ully.designpattern.singleton.lazy;

public class LazyLoadedSingleton {
	private int count;
	private static class LazyHolder {
		private static final LazyLoadedSingleton singletonInstance = new LazyLoadedSingleton();
		static {
			System.out.print("init");
		}
	}
	private LazyLoadedSingleton() {
		System.out.print("init...");
	}
	
	public static LazyLoadedSingleton getInstance() {
		
		return LazyHolder.singletonInstance;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
