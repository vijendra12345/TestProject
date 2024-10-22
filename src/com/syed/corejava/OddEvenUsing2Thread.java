
package com.syed.corejava;

public class OddEvenUsing2Thread implements Runnable {

	static int count = 1;

	Object object;

	public OddEvenUsing2Thread(Object object) {
				this.object = object;
	}

	@Override
	public void run() {
		while (count <= 10) {
			
			
			if ((count%2 == 0) && Thread.currentThread().getName().equals("even")) {
				synchronized (object) {
					System.out.println("Thread name: " + Thread.currentThread().getName() + "value " + count);
					count++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
				
				if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
					synchronized (object) {
						System.out.println("Thread name: " + Thread.currentThread().getName() + "value " + count);
						count++;
						object.notify();

					}
				
			}
		}
		}

		
		
 public static void main(String arg[])
 {
	 Object lock = new Object();
	 Runnable r1= new OddEvenUsing2Thread(lock);
	 Runnable r2= new OddEvenUsing2Thread(lock);
	 new Thread(r1,"even").start();
	 new Thread(r2, "odd").start();

		
	 
 }

}
