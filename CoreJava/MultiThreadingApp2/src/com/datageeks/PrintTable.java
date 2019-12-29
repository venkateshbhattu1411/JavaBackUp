package com.datageeks;

public class PrintTable {
	
	
	public void printTable(int n)
	{
		for(int i = 1 ; i <= 10 ; i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
