package com.tom;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Tester2 {
	
	    public static void main(String[] args) {
	        BufferedReader in = null;
	        try {
	            in = new BufferedReader(new FileReader("data.txt"));
	            String line = in.readLine();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
