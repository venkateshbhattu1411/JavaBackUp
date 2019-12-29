package com.datageeks;

public class App {

	public static void main(String[] args) {
		PrintTable table = new PrintTable();
		SampleThread t1 = new SampleThread(table, 5);
		SampleThread t2 = new SampleThread(table, 6);
		SampleThread t3 = new SampleThread(table, 7);
		t2.setPriority(10);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
	
}
