package com.puzzle;

public class TestOutput {

	public TestOutput() {
		// TODO Auto-generated constructor stub
	}
	
	public static  int getOutput(int[] arr){
		
		int sum=0;
		
		for(int i : arr){
			sum+=i;
		}
		System.out.println(sum);
		return sum-arr[1];
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int output = TestOutput.getOutput(arr);
		System.out.println(output);
		

	}

}
