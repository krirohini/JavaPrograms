/**
 * 
 */
package com.javatopic.threadANDsynchcronization;

/**
 * @author Guest
 *
 */
public class TestSynchronization {
	
	public static void main(String args[]) {
		
		// only one object
		Table obj = new Table();
		
		MyThread1 t1 = new MyThread1(obj);
		MyThread1 t11 = new MyThread1(obj);
		
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t11.start();
		t2.start();
		
	}

}
