package ully.designpattern.singleton.lazy;

public class UnThreadSafeSingleton {
	
	private static UnThreadSafeSingleton singleton;
	private int count; 
	
	public static UnThreadSafeSingleton getInstance(){
		if(singleton == null) {
			System.out.println("lazy init...");
			singleton = new UnThreadSafeSingleton();
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
