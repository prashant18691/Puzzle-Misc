package com.puzzle;


abstract  class Eat {
	abstract void eat();

	void drink() {
System.out.println("D");
	}
}

interface TP{
	abstract void t();
	
	
}
public  abstract class Abstract {
	
	private Abstract(){
		
	}
	
	public static void main(String[] args){
		Eat a = new Eat() {
			void eat(){
				System.out.println("A");
			}
			
			
			
		};
		TP tp = new TP() {
			
			@Override
			public void t() {

				System.out.println("TP");
			}
		};
		a.eat();
		a.drink();
		
		tp.t();
	}

}
