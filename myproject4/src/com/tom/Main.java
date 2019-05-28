package com.tom;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h1 = new Horse("H1:");
		h1.start();
//		for(int i =1;i<=10000;i++) {
//			System.out.println("Horse1:"+i);
//		}		
//		HorseRunnable h1 = new HorseRunnable();
//		Thread thread =new Thread(h1);
//		thread.start();
		Horse h2 = new Horse("H2:");
		h2.start();
		System.out.println("main end");
	}

}
