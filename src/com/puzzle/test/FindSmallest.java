package com.puzzle.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class FindSmallest {

    public static int[] findKSmallest(List<List<Integer>> files, int k) {
    	
    	int n = files.size();
    	List<Integer> smallestInt = new ArrayList<>();
    	for(List<Integer> f : files){
    		smallestInt.add(f.get(0));
    	}
    	for(int i=n/2-1;i>=0;i--){
    		heapify(smallestInt,n,i); //min heap
    	}
//    	System.out.println(Arrays.toString(smallestInt.toArray()));
    	for(int i=k-1;i>=0;i--){
    		Integer smallest=smallestInt.get(0);
    		
    		Integer min = getMin(files,smallest);
    		if(!smallestInt.contains(min))
    		smallestInt.add(min);
    		
    		heapify(smallestInt, i, 0);
    		
    	}
    	
    	System.out.println(Arrays.toString(smallestInt.toArray()));
    	return null;
    }
    
    private static int getMin(List<List<Integer>> files, Integer smallest) {
    	Integer min = null;
    	for(List<Integer> f : files){
    		int index = f.indexOf(smallest);
    		if(index!=-1){
    			min= f.get(index+1);
    			break;
    		}
    	}
    	
    	return min;
	}

	private static void heapify(List<Integer> smallestInt, int n, int i) {
		
    	int smallest=i;
    	int left = 2*i;
    	int right = 2*i+1;
    	
    	if(left<n && smallestInt.get(left)<smallestInt.get(smallest))
    		smallest=left;
    	
    	if(right<n && smallestInt.get(right)<smallestInt.get(smallest))
    		smallest=right;
    	
    	if(smallest!=i){
    		int temp = smallestInt.get(i);
    		smallestInt.set(i, smallestInt.get(smallest));
    		smallestInt.set(smallest,temp);
    		
    		heapify(smallestInt, n, smallest);
    		
    	}
    	
	}

	public static void main(String[] args){
    	
    	
    	List<List<Integer>> file_list = new ArrayList<List<Integer>>();
    	List<Integer> file = new ArrayList<>();
    	file.add(2);file.add(100);file.add(102);file.add(200);
    	file_list.add(file);
    	file = new ArrayList<>();
    	file.add(1);file.add(30);file.add(1000);
    	file_list.add(file);
    	file = new ArrayList<>();
    	file.add(900);file.add(1001);
    	file_list.add(file);
    	
    	findKSmallest(file_list, 3);
    	
    	
    }
}
