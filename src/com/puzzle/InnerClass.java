package com.puzzle;

public class InnerClass {

	  static int data=30;  
	 static  class Inner{  
	  static void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
	  InnerClass.Inner obj=new InnerClass.Inner();  
	  obj.msg();
	  
	  
	  InnerClass.Inner.msg();
	  }  

}
