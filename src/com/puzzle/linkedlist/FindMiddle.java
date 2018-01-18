package com.puzzle.linkedlist;

public class FindMiddle {

	LinkedList head;

	void push(int data){
		LinkedList li = new LinkedList(data);
		li.next=head;
		head=li;
	}
	
	
	public static void main(String[] args) {
		FindMiddle l = new FindMiddle();
		l.push(10);
		l.push(15);
		l.push(12);
		l.push(13);
		l.push(20);
		
		System.out.println(findMiddleElement(l.head));

	}


	private static Integer findMiddleElement(LinkedList n) {
		Integer mid = null;

		while (n != null && n.next!=null) {
			LinkedList slow = n;
			LinkedList fast = n.next.next;

			if (fast.next == null) {
				mid = slow.data;
				break;
			}
			n = n.next;
		}

		return mid;
	}

}
