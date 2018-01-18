package com.puzzle;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import for Scanner and other utility  classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
*/
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        TestClass t =new TestClass();
        System.out.println(t.fact(5));
       /* if(!isDigit(line))
        return;
        int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
            //   System.out.println("Original"+" Binary "+"Reverse");
        for (int i = 0; i < N; i++) {
            // System.out.println("hello world");
            t.checkMagicNum(br.readLine());
           
        }*/
        
    }
    
    int fact(int i){
        if(i==0)
        return 1;
        i*=fact(i-1);
        
        return i;
        
    }
    
    public void checkMagicNum(String s){
            if(isDigit(s)){
           
            
            int a = Integer.parseInt(s);
        //   System.out.println(Integer.toString(a,2));
            int t = 2*a-1;
            
            if(t==0){
                 System.out.println(0);
                 return;
            }
            
            String a_bin  = Integer.toString(t,2);
             String reverse = getReverse(a_bin);
            //   System.out.println(t+" "+a_bin+" "+ reverse);
             if(!reverse.startsWith("0") && a_bin.equals(reverse)){
                 System.out.println(t);
             }
             
             
            
        }
    }
    
    static boolean isDigit(String str){
        boolean isDigit = true;
        for(int i=0;i<str.length();i++){
            String s = String.valueOf(str.charAt(i));
            if(!s.matches("[0-9]+")){
                isDigit =false;
                break;
            }
        }
        
        return isDigit;
    }
    
     String getReverse(String str){
        if(str==null || str.length()==0)
        return null;
        if(str.length()<=1){
            return str;
        }
        
        
        return getReverse(str.substring(1))+str.charAt(0);   
    }
}

