package com.datageeks;

public class SampleThread  extends Thread{
	PrintTable table = null;
	int n;
	
	public SampleThread(PrintTable table , int n)
	{
		this.table = table;
		this.n = n;
	}
	
	public void run()
	{
		table.printTable(n);
	}
	
	
	

}
