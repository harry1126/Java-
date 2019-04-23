package com.tom;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int bonus = 500000;
		System.out.println("獎金有:"+bonus+"元");
		System.out.println("有幾個人分?");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		int div= 0 ;
		try{
			int n  = Integer.parseInt(number);
			div = bonus/n;
			System.out.print("每人可分得:"+div+"元");
		}catch(Exception e) {
			System.out.println("程式錯誤");
		}
//			catch(	ArithmeticException e) {
//			System.out.print("數值運算錯誤");
//		}catch( NumberFormatException e) {
//			System.out.print("數字格式錯誤");
//		}

	}
}
