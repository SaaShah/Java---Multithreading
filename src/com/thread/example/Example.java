package com.thread.example;

public class Example extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println("hello.. " + i);
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Example exampleOne = new Example();
		exampleOne.start();

		Example exampleTwo = new Example();
		exampleTwo.start();
	}

}
