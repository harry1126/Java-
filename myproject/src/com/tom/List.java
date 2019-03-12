package com.tom;

import java.util.ArrayList;
import java.util.Random;

public class List {

	public static void main(String[] args) {
		Random random = new Random(50); 
		java.util.List<Integer> list = new ArrayList<>();
		int r = random.nextInt(20);
		for (int i=0;i<20;i++) {
			list.add(0);
		}
		for(int i=0;i<10000;i++) {
			Integer freq = list.get(r);
			list.set( r, freq+1);
			System.out.println(r +":"+list.set(r, freq + 1));
		}
		
	}

}
