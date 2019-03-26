package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		List<String> items= new ArrayList<>();
		List<Integer> li= new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name = ""; 
		while(!name.equals("q")) {
		System.out.println("Enter your shopping items:");
		name = scanner.nextLine();
		System.out.println("Enter your quantity:");
		int quantity = Integer.parseInt(scanner.nextLine());
		if(true) {
		for(int i=0;i<1;i++) {
				items.add(name);		
		}
		for(int i =0;i<1;i++) {
			li.add(quantity);
		}
		System.out.println(name+"\t"+quantity+"­Ó³æ¦ì");
		}
		} 
	}
}
