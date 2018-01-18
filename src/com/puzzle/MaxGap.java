package com.puzzle;

public class MaxGap {

	public MaxGap() {
		// TODO Auto-generated constructor stub
	}
	
	public int findGap(int[] arr){
		int min=arr[0];int max=arr[1];
		int gap=max-min;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
//			if(gap<Math.abs(max-min)){
				gap=max-min;
//			}
		}
		System.out.println(max+" "+min);
		return gap;
	}

	public static void main(String[] args) {
		int[] arr={3,4,9,0,31,2,21,5,8,10};
		MaxGap g = new MaxGap();
		System.out.println(g.findGap(arr));
		
	}

}
