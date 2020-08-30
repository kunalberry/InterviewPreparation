package com.test.string;

import java.util.regex.Pattern;

public class ReverseEachWord {

	public static void main(String[] args) {
		String name = "Kunal Berry";
		String result = reverseEachWord(name);
		System.out.println(result);
	}

	private static String reverseEachWord(String name) {

		Pattern pattern = Pattern.compile(".");
		//String temp[] = pattern.split(name);
		
		String temp[] = name.split(" ");
		
		System.out.println(temp.length);

		String res = "";

		for (int i = 0; i < temp.length; i++) {

			if (i == temp.length - 1) {
				res = temp[i] + res;
			} else {
				res = " " + temp[i] + res;
			}
		}

//		char[] testArray = new char[name.length()];
//		for (int i = 0; i < name.length(); i++) {
//			testArray[i] = name.charAt(i);
//			if (name.charAt(i) == '.') {
//
//			}
//		}
	return res;
	}

}