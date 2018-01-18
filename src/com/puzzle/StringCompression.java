package com.puzzle;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class StringCompression {

	
	/*public String compress(String str){
		StringBuffer compressed= new StringBuffer();
		if(str==null){
			return compressed.toString();
		}
		if(str.length()<2){
			return str;
		}
		char[] chrArr = str.toCharArray();
		Map<String,Integer> map = new HashMap<>();
		for(char c:chrArr){
			Integer count=map.get(String.valueOf(c));
			if(count==null){
				map.put(String.valueOf(c), count=1);
			}
			else{
				map.put(String.valueOf(c), count+1);
			}
		}
		
		Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
		
		while (iter.hasNext()) {
			Entry<String, Integer> en = iter.next();
			if (en.getValue() == 1)
				compressed.append(en.getKey());
			else
				compressed.append(en.getKey() + en.getValue());
		}
		if (compressed.toString().length() < str.length())
			return compressed.toString();
		else
			return str;
	}
	*/

	private static void compressStr(String input) {
		
		char[] charArr = input.toCharArray();
		char last = charArr[0];
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<charArr.length;i++){
			if(last==charArr[i]){
				count++;
			}
			else{
				if(count>1){
					sb.append(""+last+count);
				}
				else{
					sb.append(""+last);
				}
					last=charArr[i];
					count=1;
			}
		}
		if(count>1){
			sb.append(""+last+count);
		}
		else{
			sb.append(""+last);
		}
		
		System.out.println(sb);
		
	}
 
	
	public static void main(String[] args) {

		StringCompression cmp = new StringCompression();
//		System.out.println(cmp.compress("abaa"));
		StringCompression.compressStr("abaa");

	}

}
