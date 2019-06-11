package com.tom;
import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;
public class Main2 {

	    public static void main(String[] args) {

	        ArrayList<String> cities = new ArrayList<>();
	        ArrayList<String> areas = new ArrayList<>();
	        ArrayList<String> postCode = new ArrayList<>();
	        try {
	            BufferedReader in = new BufferedReader(new FileReader("data.txt"));
	            String line = in.readLine();
	            String lastCity = "";
	            while(line!=null){
	                System.out.println(line);
	                String[] tokens = line.split(",");
	                if(!lastCity.equals(tokens[0])) {
	                    lastCity=tokens[0];
	                    cities.add(tokens[0]);
	                }
	                areas.add(tokens[1]);
	                postCode.add(tokens[2]);
	                line =in.readLine();
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        System.out.println(cities);
	        System.out.println("please choose city:");
	        for (int i =0;i<cities.size();i++){
	            System.out.println(i+":"+cities.get(i));
	        }
	        Scanner scanner = new Scanner(System.in);
	        int city=Integer.parseInt(scanner.nextLine());
	        System.out.println(cities.get(city));
	        
	    }
}
