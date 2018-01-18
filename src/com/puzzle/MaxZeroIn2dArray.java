package com.puzzle;

public class MaxZeroIn2dArray {

	public int findRow(int[][] arr){
		if(arr==null)
			return -1;
		int[] count=new int[5];
		for(int i=0;i<5;i++){
			count[i]=0;
			for(int j=0;j<5;j++){
				if(arr[i][j]==0){
					count[i]++;
				}
			}
		}
		int row = -1;
		int max = count[0];
		
		for(int k=1;k<count.length;k++){
			if(count[k]>max){
				max=count[k];
				row=k;
			}
				
		}
		
		
		return row;
		
	}
	
	public static void main(String[] args){
		int[][] arr = {{1,0,0,1,1},
					   {0,1,0,1,0},
					   {0,0,0,1,1},
					   {1,1,1,1,1},
					   {0,0,1,1,1}};
		
		MaxZeroIn2dArray find = new MaxZeroIn2dArray();
		System.out.println("Row  with max zero :: "+(find.findRow(arr)));
	}
}
