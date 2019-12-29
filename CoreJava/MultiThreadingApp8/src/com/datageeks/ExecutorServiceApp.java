package com.datageeks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceApp {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(
					() -> {
						for(int i = 1; i <= 5 ; i++)
						{
							System.out.println(Thread.currentThread().getName()+ " : i = "+1);
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
						}
					}
					);
		
		Thread t2 = new Thread(
				() -> {
					for(int i = 1; i <= 5 ; i++)
					{
						System.out.println(Thread.currentThread().getName()+ " : i = "+2);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				);
		
		Thread t3 = new Thread(
				() -> {
					for(int i = 1; i <= 5 ; i++)
					{
						System.out.println(Thread.currentThread().getName()+ " : i = "+3);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				);
		
		Thread t4 = new Thread(
				() -> {
					for(int i = 1; i <= 5 ; i++)
					{
						System.out.println(Thread.currentThread().getName()+ " : i = "+4);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(t1);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);
		
		service.shutdown();
	}
	
	
}
