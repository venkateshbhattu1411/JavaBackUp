package com.datageeks;

public class App {

	public static void main(String[] args) {
		Item item = new Item();
		
		Thread producerThrad = new Thread(
					() -> item.produce()
					);
		
		Thread consumerThrad = new Thread(
				() -> item.consume()
				);
		producerThrad.setName("Producer");
		consumerThrad.setName("Consumer");
		producerThrad.start();
		consumerThrad.start();
		
	}
	
	
}
