package com.tom;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				try {
				System.out.println("Please enter english");
				int english = Integer.parseInt(scanner.nextLine());
				System.out.println("Please enter math");
				int math = Integer.parseInt(scanner.nextLine());
				System.out.println((english+math)/2);
				}catch(NumberFormatException e) {
					e.printStackTrace();
				}
			}

}
