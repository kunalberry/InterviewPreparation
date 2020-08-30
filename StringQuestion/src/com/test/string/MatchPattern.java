package com.test.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


//Question Asked In Microsoft,Amazon,MakeMyTrip
public class MatchPattern {
	
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<>();
		test.add("abb");
		test.add("abc");
		test.add("xyz");
		test.add("xyy");
		String pattern = "foo";
		
		ArrayList<String> result = findMatchedWords(test,pattern);
		
		Collections.sort(result);
		
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i)+" ");
		}
	}

	private static ArrayList<String> findMatchedWords(ArrayList<String> test, String pattern) {
		ArrayList<String> res = new ArrayList<>();
	    int len = pattern.length();
	    
	    String hash = encodingHash(pattern);
	    
	    for(String str : test){
	        
	        if(str.length() == len && hash.equals(encodingHash(str))){
	            res.add(str);
	        }
	    }
	    return res;
	}

	private static String encodingHash(String pattern) {

	    HashMap<Character,Integer> map = new HashMap<>();
	    int i = 0;
	    String res = "";
	    
	    char ch;
	    for(int j = 0; j < pattern.length(); j++){
	        
	        ch = pattern.charAt(j);
	        
	        if(!map.containsKey(ch)){
	            map.put(ch,i++);
	        }
	        res += map.get(ch);
	        
	    }
	    return res;
	}

}
