package com.puzzle;

public class MaxSubArraySum {
	
	int maxSum(int[] ip){
		int sum=0;int max_sum=Integer.MIN_VALUE;
		
		for(int i=0;i<ip.length;i++){
			sum+=ip[i];
			if(sum>max_sum)
				max_sum=sum;
			if(sum<0)
				sum=0;
		}
		
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubArraySum s = new MaxSubArraySum();
		int a[]={2,-1,2,3,4,-1};
		System.out.println(s.maxSum(a));
		

	}

}
