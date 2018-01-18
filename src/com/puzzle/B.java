package com.puzzle;

public class B {
static {
System.out.println("Hello from B");
}

	  class C {
public  void display() {
System.out.println("Hello from C");
}
	}

	public static void main(String args[]) {
		C c = new B().new C();
		c.display();
	}
}
