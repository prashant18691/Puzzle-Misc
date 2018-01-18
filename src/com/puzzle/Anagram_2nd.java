package com.puzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Anagram_2nd {
	
	void printAnagram(String[] input){
		if(input==null)
			return;
		int i=0;
		Map<Integer, String> map = new HashMap<>();
		for(String s : input){
			map.put(i, sortWords(s));
			i++;
		}
		
		List<Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1,Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Entry<Integer, String> entry:list){
			System.out.print(input[entry.getKey()]+" ");
		}
		
		
	}
	
	void printArr(String[] words){
		for(String a : words)
			System.out.print(a+" ");
	}

	private String sortWords(String s) {
		if(s==null)
			return null;
		char[] strArr = s.toCharArray();
		Arrays.sort(strArr);
		
		return new String(strArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String[] strArr = null;
		if(str!=null && str.contains(" "))
			strArr = str.split(" ");
		
		Anagram_2nd a = new Anagram_2nd();
		a.printAnagram(strArr);

	}

}
