package com.datageeks;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberTask implements Callable<String> {
	
		private AtomicInteger auto = new AtomicInteger(0);


	@Override
	public String call() throws Exception {
		
		int value = auto.incrementAndGet();
		String name = Thread.currentThread().getName();
		return name +" : i = "+value;
	}

	
}
