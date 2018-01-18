package com.puzzle;

public class TestEqual {
	
	
	int f(int i){
		return i++;
	}
	
	int g(int i){
		return ++i;
	}

	public static void main(String[] args) {
		TestEqual t = new TestEqual();
		int i=0;
		int a=t.f(i);
		int b=t.g(i);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
	}

}
