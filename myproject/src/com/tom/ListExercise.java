package com.tom;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

	public static void main(String[] args) {
		List<String> enterList = new ArrayList<String>();
        //刷卡進站讀取系統
		enterList.add("407570036"+"\n"
				+ "學生"+"何忠昱"+"進站");
		enterList.add("剩餘金額");
		enterList.add("407570036"+"\n"
				+ "學生"+"何忠昱"+"出站");
		enterList.add("407570036"+"\n"
				+ "學生"+"何忠昱"+"進站");
		System.out.print(enterList);
	}

}
