package com.puzzle.linkedlist;

public class LinkedListPairWiseSwapping {
	
	LinkedList head;

	void push(int data){
		LinkedList li = new LinkedList(data);
		li.next=head;
		head=li;
	}
	
	public static void main(String[] args){
		
		LinkedListPairWiseSwapping l = new LinkedListPairWiseSwapping();
		l.push(10);
		l.push(15);
		l.push(12);
		l.push(13);
		l.push(20);
		l.push(14);
		
		
		l.print();
		System.out.println();
		
		LinkedList st = l.swap(l.head);
		
		l.head=st;
		
		l.print();
		
		
	}

	private  void print() {
		LinkedList tr =head;
		while(tr!=null){
			System.out.print(tr.data+" --> ");
			tr=tr.next;
		}
	}

	LinkedList swap(LinkedList node) {
		 
	        // If linked list is empty or there is only one node in list
	        if (node == null || node.next == null) {
	            return null;
	        }
	 
	        // Initialize previous and current pointers
	        LinkedList prev = node;
	        LinkedList curr = node.next;
	 
	        node = curr;  // Change head before proceeeding
	 
	        // Traverse the list
	        while (true) {														
	        	LinkedList next = curr.next; 									//20 --> 13 --> 12 --> 15 --> 10 -->
	            curr.next = prev; // Change next of current as previous node   // 12	 13		20			  12  10
	 
	            // If next NULL or next is the last node
	            if (next == null || next.next == null) {
	                prev.next = next;
	                break;
	            }
	 
	            // Change next of previous to next next
	            prev.next = next.next;
	 
	            // Update previous and curr
	            prev = next;
	            curr = prev.next;
	        }
	        return node;
	    }

}
