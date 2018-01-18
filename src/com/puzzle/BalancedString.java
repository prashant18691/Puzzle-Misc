package com.puzzle;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {

	  public static void main(String []argh)
	   {
	      Scanner sc = new Scanner(System.in);

	         /*String input=sc.next();
	         System.out.println("x"+" "+input.replaceAll("[^\\(\\)\\[\\]\\{\\}]", ""));
	         System.out.println("y"+" "+input.replaceAll("\\(\\)|\\[\\]|\\{\\}", ""));*/
	      
	      
	      /*while (sc.hasNext()) {
	         String input=sc.next().replaceAll("[^\\(\\)\\[\\]\\{\\}]", "");
	         while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
	         System.out.println(input.isEmpty());
	      }*/
	      
	      
	      while (sc.hasNext()) {
	    	  String input=sc.next();
	    	 System.out.println(isBalanced2(input));
	      }
	      
	     
	      
	   }
	  
	private static boolean isBalanced2(String ip) {
		int count = 0;
		if (!ip.startsWith("(")) {
			return false;
		} else {
			count=1;
			for (int i = 1; i < ip.length(); i++) {

				if (count < 0)
					return false;

				String s = String.valueOf(ip.charAt(i));
				if (s != null) {
					if (s.equals(")"))
						count--;
					else
						count++;
				}

			}
		}

		if (count == 0)
			return true;
		else
			return false;

	}

	private static boolean isBalanced(String input) {
		Stack<String> s = new Stack<>();
		  
		  for(int i=0;i<input.length();i++){
			  String inputStr = String.valueOf(input.charAt(i));
			  if(inputStr.equals("(") || inputStr.equals("{") || inputStr.equals("[")) //opening strings
				  s.push(inputStr);
			  else if(inputStr.equals(")")){ // closing strings 
				  if(s.isEmpty())
					  return false;
				  if(!s.pop().equals("("))
						  return false;
			  }
			  else if(inputStr.equals("}")){ // closing strings 
				  if(s.isEmpty())
					  return false;
				  if(!s.pop().equals("{"))
						  return false;
				  
			  }
			  else if(inputStr.equals("]")){ // closing strings 
				  if(s.isEmpty())
					  return false;
				  if(!s.pop().equals("["))
						  return false;
				  
			  }
				
			  
		  }
		  
		  return s.isEmpty();
		  
	}
	 
}
