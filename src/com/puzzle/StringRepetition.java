package com.puzzle;

import java.util.Arrays;

public class StringRepetition {// abcabc,abc====> (abc)*2
	
	void checkStringRepetition(String str,String pat){
		//native Pattern search
		/*int n = str.length();
		int m= pat.length();
		int i,j;
		for(i=0;i<=n-m;i++){
			for(j=0;j<m;j++)
				if(str.charAt(i+j)!=pat.charAt(j))
					break;
			if(j==m)
				System.out.println("pattern found at index "+i);
		}*/
		int n = str.length();
		int m = pat.length();
		int[] lps = new int[m];
		computeLPS(pat,m,lps); 
		
//		printArr(lps);
		
		
		int i=0,j=0;
		
		while(i<n){
			if(pat.charAt(j)==str.charAt(i))
				i++;j++;
				
			if(j==m){
				System.out.println("Pattern found at index "+(i-j));
				j=lps[j-1];// ?????????
			}
			else if(i<n && pat.charAt(j)!=str.charAt(i)){
				if(j!=0)
				j=lps[j-1];
				else
					i++;
			}
		}
		
		
		
	}

	private void computeLPS(String str, int n, int[] lps) {

		int len=0;int i=1;
		lps[0]=0;
		while(i<n){
			
			if(str.charAt(len)==str.charAt(i)){
				len++;
				lps[i]=len;
				i++;
			}
			else{
				if(len!=0){
					len=lps[len-1];
				}
				else{
					lps[i]=0;
					i++;
				}
			}
			
		}
	}
	
	void printArr(int[] arr){
		for(int i:arr)
			System.out.print(i+" ");
	}

	public static void main(String[] args) {
		StringRepetition s = new StringRepetition();
		s.checkStringRepetition("abcabc","AABAACAABAA");

	}

}
