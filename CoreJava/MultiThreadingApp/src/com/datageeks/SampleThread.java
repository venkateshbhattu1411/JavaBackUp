package com.datageeks;

public class SampleThread  implements Runnable{
	
	public void run()
	{
		System.out.println(" Thread is running !!!");
		System.out.println(Thread.currentThread().getName() + " : "+Thread.currentThread().getPriority());
	}
	
	
	public static void main(String[] args) {
		SampleThread s = new SampleThread();
		Thread t = new Thread(s);
		t.setName("Naresh Thread");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
	}

}
