package com.tom;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis =new FileInputStream("Sale.txt");
			InputStreamReader isr =new InputStreamReader(fis);
			BufferedReader in =new BufferedReader(isr);
			String Line =in.readLine();
			while(Line!=null) {
				System.out.println(Line);
				String[] tokens = Line.split(",");
				if(tokens.length ==2) {
					System.out.println(tokens[0]+"/"+tokens[1]);
					int n =Integer.parseInt(tokens[1]);
					if(n==10) {
						System.out.println("price"+":"+12000);
					}else if(n>10) {
						System.out.println("price"+":"+12000+"plus"+(n-10)*3000);
					}
				}	
				Line =in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
