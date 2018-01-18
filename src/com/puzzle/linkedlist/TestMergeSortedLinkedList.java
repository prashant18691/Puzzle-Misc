package com.puzzle.linkedlist;

public class TestMergeSortedLinkedList {
	
	LinkedList mergedLhead;
	
	LinkedList head1;
	LinkedList head2;
	
	public LinkedList mergeSortedLL1(LinkedList t1,LinkedList t2){
		if(t1==null) return t2;
		if(t2==null) return t1;
		
		if(t1.data<t2.data){
			t1.next=mergeSortedLL1(t1.next, t2);
			return t1;
		}
		else{
			t2.next=mergeSortedLL1(t2.next, t1);
			return t2;
		}
	}
	
	public void mergeSortedLL(LinkedList t1,LinkedList t2){
		
		
		int n1 = getNodesCount(head1);
		int n2 = getNodesCount(head2);
		
		
		
		
		while(t1!=null){
			if(t1.next!=null)
			t1=t1.next;
			else
				break;
		}
		
		t1.next=t2;
		
		t1=head1;
		mergedLhead = t1;
		
		printLL(mergedLhead);
		
		
		sort(0,n1+n2-1);
		
		System.out.println();
		
		printLL(mergedLhead);
			
		
	}
	
	void printLL(LinkedList n){
		while(n!=null){
			System.out.print(n.data+"-->");
			n=n.next;
		}
	}

	private void sort(int low, int high) {

		int i=low;
		int j=high;
		
		LinkedList pivot = getNode(mergedLhead,(low+high)/2);
		
		while(i<=j){
			
			
			while(getNode(mergedLhead,i).data<pivot.data)
				i++;
			
			while(getNode(mergedLhead,j).data>pivot.data)
				j--;
			
			if(i<=j){
				swap(getNode(mergedLhead,i).data,getNode(mergedLhead,j).data);
				i++;j--;
			}
			
		}
		
		if(low<j)
			sort(low, j);
		
		if(i<high)
			sort(i, high);
		
	}

	

void swap(int x,int y){
		
		if(x==y)
			return;
		
		LinkedList temp = mergedLhead;
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
		
	
		
		if(prevX!=null)
		prevX.next=nodeY;
		else
			mergedLhead=nodeY;
		
		if(prevY!=null)
			prevY.next=nodeX;
		else
			mergedLhead=nodeX;
		
		LinkedList temps = nodeX.next;
		nodeX.next=nodeY.next;
		nodeY.next=temps;

		
	}

	private LinkedList getNode(LinkedList n,int i) {
		// TODO Auto-generated method stub
		while(i>0){
			if(n!=null)
				n=n.next;
			i--;
		}
		
		return n;
	}

	private int getNodesCount(LinkedList n) {
		int count = 0;
		while(n!=null){
			count++;
			n=n.next;
		}
		return count;
	}
	
	public void pushLL1(int data){
		LinkedList n = new LinkedList(data);
		n.next=head1;
		
		head1=n;
			
	}
	
	public void pushLL2(int data){
		LinkedList n = new LinkedList(data);
		n.next=head2;
		
		head2=n;
			
	}

	public static void main(String[] args) {

		TestMergeSortedLinkedList l = new TestMergeSortedLinkedList();
		
		l.pushLL1(10);
		l.pushLL1(6);
		l.pushLL1(5);
		l.pushLL1(4);
		l.pushLL1(2);
		
		l.pushLL2(23);
		l.pushLL2(21);
		l.pushLL2(12);
		l.pushLL2(1);
		
		
//		l.mergeSortedLL(l.head1,l.head2);
		
		LinkedList mergHead=l.mergeSortedLL1(l.head1,l.head2);
		
		l.printLL(mergHead);
		
		
	}

}
