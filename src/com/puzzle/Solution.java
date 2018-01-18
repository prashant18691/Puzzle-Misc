package com.puzzle;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ip = new Scanner(System.in);
        
        int t = ip.nextInt();
        
        while(t>0){
        int n = ip.nextInt();
        int m = ip.nextInt();
        int[] arr = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=ip.nextInt();
            }
            
         System.out.println(isSolvable(m,arr,0));
            t--;
        }
    }
    
    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }
    
    private static String result(int[] arr,int n,int m){
        
        if(m>n-1)
            return "YES";
        
        int count = 0;
        for(int i=0;i<n-1;i++){   //0 0 0 1 1 1
            if(count>n-1)
                return "YES";
            if(arr[i+1]==0)
                count++;
            else if((i+m)>n-1)
                return "YES";
            else{
                if(arr[i+m]==0)
                    count+=m+i;
                else{
                    if(i>0 && arr[i-1]==0)
                        count-=1;
                    else
                        return "NO";
                        
                }
            }
                
            
        }
        
        
        return "YES";
    }
}