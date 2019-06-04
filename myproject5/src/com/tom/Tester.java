package com.tom;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Breakfast breakfast = new Breakfast();
		breakfast.start();
		try {
			breakfast.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		BrushTeeth bt = new BrushTeeth();
		Thread thread = new Thread(bt);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}
}
