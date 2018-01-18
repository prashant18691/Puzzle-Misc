package com.puzzle;

import java.util.ArrayList;
import java.util.Arrays;

public class OOM {
	public OOM() {
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] i = new int[Integer.MAX_VALUE];
		
		String c = "Hello I am";
		System.out.println(c.endsWith("Hello"));
		
		Integer i=0;
        Integer j=0;
        for(Short z=0;z<5;z++)
        if((++i>3)|| (++j>3))
        i++;
        System.out.println(i);
        
        
        ArrayList obj = new ArrayList();

        obj.add("A");

        obj.add("B");

        obj.add("C");

        obj.add(1, "D");

        System.out.println(obj);
        
        System.out.println(10+20+"H");
        
        StringBuffer c2 = new StringBuffer("Hello");
        StringBuffer c1 = new StringBuffer(" World");
        c2.append(c1);
        System.out.println(c2);
        
        String s1 = "Hello"; 
        StringBuffer sb = new StringBuffer(s1); 
        sb.reverse(); 
        s1.concat(sb.toString()); 
        System.out.println(s1 + sb + s1.length() + sb.length()); 
        
        
        
        int a = 1;
        int b = 2;
        int d = 3;
        a |= 4;
        b >>= 1;
        d <<= 1;
        a ^= d;
        System.out.println(a + " " + b + " " + d);
        byte[] c3 = s1.getBytes();
        
        String [] arg;
        int x;
        x = args.length;
        for (int y = 1; y <= x; y++) {
            System.out.print(" " + args[y]);
        }
        
        
        String s4 = args[1];
        String s2 = args[2];
        String s3 = args[3];
        System.out.print(" args[2] = " + s2);
        
        int[] a1 = {1,5,3,2};
        Arrays.sort(a1);
        
        
	}
	
	void display(){
		
		abstract class local{
			
			
		}
	}

}
