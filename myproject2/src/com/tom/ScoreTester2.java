package com.tom;

import java.util.Scanner;

public class ScoreTester2 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Please enter english:");
		Score english =new Score(args[0]);
		System.out.println("Please enter math:");
		Score math = new Score(args[1]);
		System.out.println((math.value+english.value)/2);
		}catch(ScoreFormatException e) {
			e.printStackTrace();
		}
	}

}
