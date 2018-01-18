package com.puzzle;

public class TestException {

	public static void main(String[] args) {

		TestException e = new TestException();
		
		e.testException();
		
		
	}

	private int testException() {

		try {
			int a = 1 / 0;
		} finally {
			return 1;
		}
	}

}
