package com.puzzle;

public class MatrixSumAtIJ {
	
	
	
	
	 int[] findSumExceptIJ(int[][] matrix,Cell[] arr){
		int[] result = new int[arr.length];
		
		int sum=0;
		int[] rowSum = new int[3];
		int[] colSum = new int[3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				sum+=matrix[i][j];
				rowSum[i]+=matrix[i][j];
				colSum[j]+=matrix[i][j];
			}
		}
		
		for(int k=0;k<arr.length;k++){
			int r = arr[k].row;
			int c= arr[k].col;
			result[k]=sum-rowSum[r]-colSum[c]+matrix[r][c];
		}
		
		return result;
	}

	public static void main(String[] args) {
		MatrixSumAtIJ m = new MatrixSumAtIJ();
		Cell[] ip = {new Cell(0, 0),new Cell(1, 1),new Cell(0, 1)};
		int[][] arr = {{1, 1, 2}, {3, 4, 6}, {5, 3, 2}};
		int[] result=m.findSumExceptIJ(arr, ip);
		
		for(int i:result){
			System.out.println(i);
		}
	}

}

class Cell{
	int row;int col;


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getCol() {
		return col;
	}


	public void setCol(int col) {
		this.col = col;
	}


	public Cell(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	
	
}
