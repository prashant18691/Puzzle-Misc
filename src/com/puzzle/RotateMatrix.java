package com.puzzle;

public class RotateMatrix {// rotate by 90 degree anti clockwise

	int[][] matrix;
	
	void rotateMatrix(){
		int n = matrix.length;
		for(int i=0;i<n/2;i++){
			for(int j=i;j<n-i-1;j++){
				int temp = matrix[i][j];
				matrix[i][j]=matrix[j][n-i-1];
				matrix[j][n-i-1]=matrix[n-i-1][n-j-1];
				matrix[n-i-1][n-j-1]=matrix[n-j-1][i];
				matrix[n-j-1][i]=temp;
			}
		}
		
	}
	void printMatrix(){
		for(int i=0;i<matrix.length;i++){
			System.out.println();
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+" ");
			}
		}
	}
	
	
	public static void main(String[] args) {

		int[][] arr = {{1,2,3,4,5},
			   	   {6,7,8,9,10},
			   	   {11,12,13,14,15},
			   	   {16,17,18,19,20},
			   	   {21,22,23,24,25}};
		
		RotateMatrix m = new RotateMatrix();
		m.matrix=arr;
		m.rotateMatrix();
		m.printMatrix();
	}

}
