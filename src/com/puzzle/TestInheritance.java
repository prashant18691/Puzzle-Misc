package com.puzzle;

public class TestInheritance {

	public static void main(String[] args) {

		TestInheritance t = new A();
		
		System.out.println(t instanceof TestInheritance);
	}

}

class A extends TestInheritance{
	
}
