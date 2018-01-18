package com.puzzle;

public class StackOverflowError {

	static void createSOE(){
		createSOE();
	}
	public static void main(String[] args) {

		StackOverflowError.createSOE();
		
	}

}
