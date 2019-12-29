package com.datageeks;

public class LamdaExpression  {
	
	
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
				System.out.println(" Lamda Expression Thread is running !!!");
		} );
		
		t1.start();
	}

}
