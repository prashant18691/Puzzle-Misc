package com.puzzle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByValue {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("b", 8);
		m.put("a", 2);
		m.put("c",4);
		
		Map<String,Integer> treeM = new TreeMap<>(m);
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		for(Map.Entry<String, Integer> entry:treeM.entrySet()){
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		LinkedHashMap<String, Integer> sortedMap=SortMapByValue.sortByVal(m);
		Iterator<Entry<String, Integer>> ite=sortedMap.entrySet().iterator();
		while(ite.hasNext()){
			Entry en= ite.next();
			System.out.println(en.getKey()+" :: "+en.getValue());
		}
//		sortByValue2(m);
		
	}

	private static void sortByValue2(Map<String, Integer> m) {
		Set<Entry<String,Integer>> entrySet=m.entrySet();
		List<Entry<String,Integer>> l = new ArrayList<>(entrySet);
		Collections.sort(l, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Entry<String, Integer> i:l){
			System.out.println(i.getKey()+" :: "+i.getValue());
		}
	}

	public static LinkedHashMap sortByVal(Map<String,Integer> m){
		List<String> keyList=new ArrayList<>(m.keySet());
		List<Integer> valueList=new ArrayList<>(m.values());
//		Collections.sort(keyList);
		Collections.sort(valueList);
		
		LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
		
		for(Integer i : valueList){
			for(String j : keyList){
				Integer k = m.get(j);
				if(i==k){
					linkedMap.put(j, i);
					keyList.remove(j);
					break;
				}
			}
		}
		
		return linkedMap;
	}
}
