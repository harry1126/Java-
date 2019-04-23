package com.tom;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int math = 0;
		int english = 0;
		try {
		System.out.println("請輸入數學成績:");
		math = Integer.parseInt(scanner.nextLine());
		}catch(ArithmeticException e) {
			System.out.print("數值錯誤");
		}catch(NumberFormatException e) {
			System.out.print("格式錯誤");
		}
		System.out.println("請輸入英文成績:");
		english = Integer.parseInt(scanner.nextLine());
		
		int average = (math+english)/2;
		System.out.print("平均:"+average);
		
	}
}
