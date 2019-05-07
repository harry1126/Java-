package com.tom.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt("35");
//		try {
//			FileReader fr = new FileReader("aa.txt");
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		File file = new File("aa.txt");
//		if(file.exists()) {
//			System.out.println(file.getAbsoluteFile());
//			System.out.println(file.length());
//			System.out.println(file.getAbsolutePath());
//		}
//		File dirr = new File("C:\\Intel");
//		if(dirr.exists()) {
//			String[] files = dirr.list();
//			for(String s:files)
//			System.out.println(s);
//		}
		File dir = new File("C:\\Intel");
		if(dir.exists()&& dir.isDirectory()) {
			File[] files = dir.listFiles();
			for(File f:files) {
				if(f.isFile()) {
					System.out.println(f.getName());
					System.out.println(f.toString());
				}
				
			}
			System.out.println(dir.mkdir());
			File dd = new File(dir, "aaaa");
			System.out.println(dd.mkdirs());
			System.out.println(dd.delete());
		}
	}

}
