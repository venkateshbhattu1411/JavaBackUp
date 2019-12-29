package com.datageeks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceApp {

	public static void main(String[] args) throws Exception {
		
		NumberTask task = new NumberTask();
		
		List<Future<String>> futureList = new ArrayList<Future<String>>();
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		int i = 0;
		
		while( i < 100)
		{
		Future<String> future =	service.submit(task);
		futureList.add(future);
		i++;
		}
		
		for(Future<String> f : futureList)
		{
			String value = f.get();
			System.out.println(value);
		}
		
		service.shutdown();
	}
	
}
