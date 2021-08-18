package com.recursion;

public class MatrixProblem {
	
	public int num_of_paths(int rows, int col){
		if(rows==1 || col==1)
			return 1;
		else
			return  num_of_paths(rows-1, col) + num_of_paths(rows, col-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixProblem matrix=new MatrixProblem();
		System.out.println(matrix.num_of_paths(200, 1));

	}

}
