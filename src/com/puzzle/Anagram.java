package com.puzzle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	
    	String inputStr = sorting(s.next());
    	
    	String[] str = {"bat","tab","tba","car","car","rac","acr","stack" ,"sackt" ,"stakc"};
    	Anagram a =new Anagram();
    	Map<String,Set<String>> anagramMap=a.findAnagram(str);
    	
    	System.out.println(anagramMap.get(inputStr));
    	
    }
    
    public Map<String,Set<String>> findAnagram(String[] strList){
    	if(strList==null)
    		return null;
    	Map<String,Set<String>> m= new HashMap<>();
		for (String str : strList) {
			String beta = sorting(str);
			Set<String> l = m.get(beta);
			if (l == null) {
				m.put(beta, l = new HashSet<>());
			}
			l.add(str);
//			Collections.sort(l);
		}
		return m;
		
		
		/*for(Map.Entry<String, Set<String>> entry:m.entrySet()){
			System.out.println(entry.getValue().toString());
		}*/
    }

    private static String sorting(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
