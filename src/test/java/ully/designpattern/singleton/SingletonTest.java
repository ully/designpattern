package ully.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.Assert;

import org.junit.Test;

import ully.designpattern.singleton.eager.Singleton;

public class SingletonTest {
	
	@Test
	public void testSingleton(){
		Singleton singleton = Singleton.getInstance();
		singleton.setCount(10);
		Singleton singleton1 = Singleton.getInstance();
		Assert.assertEquals(10, singleton.getCount());
		
	}
	
	@Test
	public void testSingletonWithSerializable() {
		storeSingleton();
		Singleton singleton = null;
	    singleton = restore();
	    singleton.setCount(10);
	    Singleton singleton1 = restore();
	    Assert.assertEquals(10, singleton1.getCount());
	}

	private Singleton restore() {
		Singleton singleton=null;
		try {
		    FileInputStream fis = new FileInputStream("d:\\singleton.txt");
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    
		    singleton = (Singleton)ois.readObject();
		    
		} catch (Exception e) {
		    // TODO: handle exception
		    e.printStackTrace();
		}
		return singleton;
	}

	private void storeSingleton() {
		Singleton singleton = Singleton.getInstance();
	        try {
	            FileOutputStream fos = new FileOutputStream("d:\\singleton.txt");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(singleton);
	            oos.flush();
	            oos.close();
	        } catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        }
	}
}
