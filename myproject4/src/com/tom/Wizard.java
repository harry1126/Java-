package com.tom;

import java.util.Vector;

public class Wizard extends Thread {
	
	public static synchronized void thunder() {
		System.out.println("THUNDER START!!");
		try {
			Thread.sleep(2000);
			System.out.println("THUNDER END!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		thunder();
	}
	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.start();
		Wizard w2 = new Wizard();
		w2.start();
	}

}
