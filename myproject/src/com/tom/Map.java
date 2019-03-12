package com.tom;

import java.util.HashMap;
import java.util.Random;

public class Map {
	public static void main(String[] args) {
		Random rand = new Random(52);
		java.util.Map<Integer, Integer> m  = new HashMap<>();
		for(int i = 0;i<10000;i++) {
		int r = rand.nextInt(20);
		Integer freq = m.get(r);
		if(freq == null) {
			m.put(r, 1);
		}else {
			m.put(r, freq+1);
		}
		System.out.println(m);	
		}
		
	}
}
