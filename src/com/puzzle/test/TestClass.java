package com.puzzle.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args){
		
	        //Scanner
	        Scanner s = new Scanner(System.in);
	        
	        int t = s.nextInt();
	        while(t>0){
	        	int N = s.nextInt();
		        int[] arr = new int[N];
		        
		        for (int i = 0; i < N; i++) {
		            arr[i]= s.nextInt();
		        }
		        
		        System.out.println(findMaxSumContiguous(arr)+" "+findMaxSumNonConti(arr));
		        
		        t--;
	        }
	        

	}

	private static int findMaxSumNonConti(int[] arr) {
		


		int max_sum = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(sum>max_sum)
				max_sum=sum;
			else
				sum=max_sum;
			
			if(sum<0)
				sum=0;
		}
		
		return max_sum;
	
	}

	private static int findMaxSumContiguous(int[] arr) {

		int max_sum = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(sum>max_sum)
				max_sum=sum;
			
			if(sum<0)
				sum=0;
		}
		
		return max_sum;
	}

}
