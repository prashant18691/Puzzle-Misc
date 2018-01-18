package com.puzzle;

public class TestSquareRoot {
	
	public static double findSquareRoot(int i){
		double rootValue=1.00;
		double num = i;
		
		for(int k=0;k<i;k++){
			rootValue=0.5*(rootValue+(num/rootValue));
		}
		
		int returnVal=(int)(rootValue*100);
		rootValue=returnVal;
		rootValue/=100;
		
		return rootValue;
	}
	
	public static double getSquareRoot(int a){
		if(a==0 || a==1){
			return a;
		}	
		double start=0;
		double end=a;
		double result=0;
		double e = 0.0000000001;
		
		while(start<=end){
		
		double mid=(start+end)/2;
		
		if(Math.abs(a-mid*mid)<=e){
			int returVal=(int)(mid*1000);
			mid=returVal;
			mid/=1000;
			return mid;
		}
		
		if(mid*mid>a)
			end=mid;
		else if(mid*mid<a)
			start=mid;
		else
			result=mid*mid;
		
		}
		
		return result;
	}

	public static void main(String[] args) {

		System.out.println(TestSquareRoot.getSquareRoot(3));
	}

}
