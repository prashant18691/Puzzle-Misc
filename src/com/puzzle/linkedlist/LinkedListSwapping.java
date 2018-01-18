package com.puzzle.linkedlist;

public class LinkedListSwapping {
	
	LinkedList head;
	
	void swap1(int x,int y){
		
		if(x==y)
			return;
		
		LinkedList temp = head;
		LinkedList nodeX=null,prev=null,prevX=null,nodeY=null,prevY=null;
		while(temp!=null){
			if(x==temp.data){
				nodeX = temp;
				prevX=prev;
			}
			else if(y==temp.data){
				nodeY = temp;
				prevY=prev;
			}

			prev=temp;
			temp=temp.next;	
		}
		
		if(nodeX==null || nodeY==null)
			return;
		
		/*System.out.println("prev data "+prevX.data+" Xdata :"+nodeX.data+" X next data :"+nodeX.next.data);
		System.out.println("prev data "+prevY.data+" Ydata :"+nodeY.data+" Y next data :"+nodeY.next.data);*/

		/*LinkedList xN = new LinkedList(nodeX.data);
		LinkedList yN = new LinkedList(nodeY.data);*/
		
		if(prevX!=null)
		prevX.next=nodeY;
		else
			head=nodeY;
		
		if(prevY!=null)
			prevY.next=nodeX;
		else
			head=nodeX;
		
		LinkedList temps = nodeX.next;
		nodeX.next=nodeY.next;
		nodeY.next=temps;
		
		
		
		
		
		/*
		if(nodeX.next!=null && nodeX.next.data==nodeY.data){// if adjacent
			yN.next=xN;
			xN.next=nodeY.next;
		}
		else{
			yN.next=nodeX.next;
			prevY.next=xN;
			xN.next=nodeY.next;
		}*/
		
		
	
			
		
	}
	
	void push(int data){
		LinkedList li = new LinkedList(data);
		li.next=head;
		head=li;
	}
	
	public static void main(String[] args){
		
		LinkedListSwapping l = new LinkedListSwapping();
		l.push(10);
		l.push(15);
		l.push(12);
		l.push(13);
		l.push(20);
		l.push(14);
		
		
		LinkedList tr = l.head;
		while(tr!=null){
			System.out.print(tr.data+" --> ");
			tr=tr.next;
		}
		
		System.out.println();
		
		l.swap1(12, 13);
		
		while(l.head!=null){
			System.out.print(l.head.data+" --> ");
			l.head=l.head.next;
		}
		
	}

}


