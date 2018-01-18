package com.puzzle.linkedlist;

public class DetectLoop {
	
	Node head;
	int V;
	
	
	
	public DetectLoop(Node head, int v) {
		super();
		this.head = head;
		V = v;
	}



	void detectAndRemoveLoop(){
		Node next = head;
		Node nextNext=null;
		for(int i=0;i<V;i++){
			if(next!=null && next.next!=null){
			 nextNext = next.next;
			 
			 if(next.data==nextNext.data){
				 
			 }
			 else{
				 next=next.next;
			 }
			
			
			}
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		super();
		this.data = data;
	}
	
	
}
