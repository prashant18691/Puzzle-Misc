package com.puzzle;

public class TOH {
	
	void tOH(int n,String fromRod,String toRod, String auxRod){
		if(n==1){
			System.out.println("Move disk 1 from rod "+fromRod+" to rod "+toRod);
			return;
		}
		tOH(n-1, fromRod, auxRod, toRod);
			System.out.println("Move disk "+n+" from rod "+fromRod+" to rod "+toRod);
		tOH(n-1, auxRod, toRod, fromRod);
	}

	public static void main(String[] args) {
		TOH t = new TOH();
		t.tOH(4, "A", "B", "C");

	}

}
