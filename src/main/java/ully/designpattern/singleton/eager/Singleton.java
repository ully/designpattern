package ully.designpattern.singleton.eager;

import java.io.Serializable;


/**
 * eager singleton
 * 如果初始化操作 比较多，可以直接写在static代码块
 * 
 * 由于初始化过程，仅在加载类时进行一次，故此方法是线程安全的
 * 
 * 特别的，如果该singleton实现了Serializable接口，为了保证每次反序列化
 * 都是同一个singleton对象，需要增加
 * 	private Object readResolve(){
		return instance;
	}
	方法
 * @author lihan01
 *
 */
public class Singleton implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5902363018159528162L;

	private int count = 0;
	
	private static Singleton instance = new Singleton();
	static {
		System.out.println("static");
		instance = new Singleton();
	}
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		return instance;
	}
	
	/**可以避免每次序列化都产生一个新对象
	 * The readResolve method is called when ObjectInputStream has read an object from the stream 
	 * and is preparing to return it to the caller. 
	 * ObjectInputStream checks whether the class of the object defines the readResolve method. 
	 * If the method is defined, the readResolve method is called to allow the object in the stream to 
	 * designate the object to be returned. 
	 * The object returned should be of a type that is compatible with all uses. 
	 * If it is not compatible, a ClassCastException will be thrown when the type mismatch is discovered.
	 * http://docs.oracle.com/javase/1.3/docs/guide/serialization/spec/input.doc6.html
	 * 
	 * http://book.51cto.com/art/200901/106063.htm
	 * @return
	 */
	private Object readResolve(){
		return instance;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
