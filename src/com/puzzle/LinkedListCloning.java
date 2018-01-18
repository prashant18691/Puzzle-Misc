package com.puzzle;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCloning {
	
	Node head;
	
	public LinkedListCloning(Node head) {
		super();
		this.head = head;
	}
	
	public void push(int data){
		Node node = new Node(data);
		node.next=this.head;
		this.head=node;
	}
	
public void cloneList(){
		
		Map<Node,Node> map = new HashMap<Node,Node>();
		Node originalCurr=head;
		Node copyCurr=null;
		
		while(originalCurr!=null){
			copyCurr=new Node(originalCurr.data);
			map.put(originalCurr, copyCurr);
			originalCurr=originalCurr.next;
		}
		
		originalCurr=this.head;
		
		while(originalCurr!=null){
			copyCurr=map.get(originalCurr);
			copyCurr.next=map.get(originalCurr.next);
			copyCurr.random=map.get(originalCurr.random);
			originalCurr=originalCurr.next;
		}
		
		copyCurr=map.get(this.head);
		
		System.out.println("xxxxxxxxxxxx Copy List xxxxxxxxxxxxxxx");
		printList(copyCurr);
		
	}

	private void printList(Node node) {
		while(node!=null){
			Node random=node.random;
			Node next = node.next;
			
			int randomData = random!=null?random.data:-1;
			int nextData = next!=null?next.data:-2;
			
			
			System.out.println("Data "+node.data+" Next Data "+nextData+" Random Data "+randomData);
			node=node.next;
		}
	}



	public static void main(String[] args) {

		LinkedListCloning list = new LinkedListCloning(new Node(5));
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		list.head.random=list.head.next.next;
		list.head.next.random=list.head.next.next.next.next;
		list.head.next.next.random=list.head;
		list.head.next.next.next.random=list.head.next;
		list.head.next.next.next.next.random=list.head.next.next.next;
		
		list.cloneList();
		
	}

}

class Node{
	
	int data;
	Node next,random;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
		this.random = null;
	}
	
	
	
	
	
}
