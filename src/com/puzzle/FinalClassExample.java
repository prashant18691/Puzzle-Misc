package com.puzzle;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public final class FinalClassExample {// Immutable class

	private final int id;
	
	private final String name;
	
	private final HashMap<String,String> testMap;
	
	public FinalClassExample(int id,String name,HashMap<String,String> map) {
		this.id=id;
		this.name=name;
		HashMap<String,String> tempMap = new HashMap<>();
		Iterator<Entry<String,String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String,String> e=it.next(); 
			tempMap.put(e.getKey(), e.getValue());
		}
		
		this.testMap=tempMap;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>)testMap.clone();
	}
	
	public static void main(String[] args){
		int id=10;String name="original";
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "Second");
		
		FinalClassExample f = new FinalClassExample(id, name, map);
		
		System.out.println(id==f.getId());
		System.out.println(name.equals(f.getName()));
		System.out.println(map.equals(f.getTestMap()));
		System.out.println("id "+f.getId());
		System.out.println("testmap "+f.getTestMap());
		
		id=20;name="modified";
		map.put("3", "new");
		System.out.println("id "+f.getId());
		System.out.println("name "+f.getName());
		System.out.println("testmap "+f.getTestMap());
		
		HashMap<String, String> map1 = f.getTestMap();
		map1.put("4", "fourth");
		System.out.println("testmap "+f.getTestMap());
		
		
		int id1 = f.getId();
		id1=40;
		System.out.println(f.getId());
	}

}
