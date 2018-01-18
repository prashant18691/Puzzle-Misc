package com.puzzle;

import java.util.ArrayList;
import java.util.List;

public class TestStack {
	
	static List<Object> stack;
	
	 Object pop(){
		 
		 if(stack==null)
		 return null;
		 
		 return stack.remove(stack.size()-1);
		
	}
	
	void push(Object o){
		if(stack==null)
			stack = new ArrayList<>();
		
		stack.add(o);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStack s = new TestStack();
		s.push(1);
		s.push("2");
		s.push("as");
		
		int size  =stack.size();
		
		for(int i=0;i<size;i++)
			System.out.println(s.pop());
				
	}

}
