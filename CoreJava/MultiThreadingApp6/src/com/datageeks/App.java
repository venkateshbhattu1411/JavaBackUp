package com.datageeks;

public class App {

	public static void main(String[] args) {
		PrintTable table = new PrintTable();
		SampleThread t1 = new SampleThread(table, 5);
		SampleThread t2 = new SampleThread(table, 6);
		SampleThread t3 = new SampleThread(table, 7);

		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}
