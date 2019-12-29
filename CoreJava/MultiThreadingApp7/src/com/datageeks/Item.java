package com.datageeks;

import java.util.ArrayList;
import java.util.List;

public class Item {
	
	private volatile List<String> list = new ArrayList<String>();
	private volatile int n = 1;
	
	public synchronized void produce()
	{
		while(n <= 10)
		{
			if(list.size() == 0)
			{
				System.out.println(Thread.currentThread().getName()+ " :: "+"Item "+n +" Produced");
				list.add("Item "+n );
				n++;
				notify();
			}else
			{
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	public synchronized void consume()
	{
		while(n <= 10)
		{
			if(list.size() == 1)
			{
				System.out.println(Thread.currentThread().getName()+ " :: "+list.get(0)+" Consumed");
				list.remove(0);
				notify();
			}else
			{
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
