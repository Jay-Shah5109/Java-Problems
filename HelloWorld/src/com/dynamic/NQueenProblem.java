package com.dynamic;

public class NQueenProblem {
	
	final int N=4;
	
	// Print solution
	void printSolution(int board[][]){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(" "+board[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	
	
	// IsSafe function to check if the queen is placed in the right position
	boolean isSafe(int board[][], int row, int col){
		int i,j;
		// Search in row on left side
		for(i=0;i<col;i++){
			if(board[row][i]==1)
				return false;
		}
		
		// Search the upper left diagonal
		for(i=row, j=col; i>=0 && j>=0;i--,j--){
			if(board[i][j]==1){
				return false;
			}
		}
		
		// Search the lower left diagonal
		for(i=row,j=col;i<N && j>=0;i++,j--){
			if(board[i][j]==1){
				return false;
			}
		}
		
		return true;
	}
	
	boolean SolveNQUtil(int board[][], int col){
		// If all queens are placed in the correct position then return true
		if(col>=N)
			return true;
		
		for(int i=0;i<N;i++){
			if(isSafe(board, i, col)){
				board[i][col]=1;
				if(SolveNQUtil(board, col+1)==true){
					return true;
				}
				board[i][col]=0;
			}
		}
		
		return false;
		
	}
	
	boolean solveNQ(){
		int board[][]={{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
				
		};
		
		if(SolveNQUtil(board,0)==false){
			System.out.println("Solution does not exist!");
			return false; 
		}
		
		printSolution(board);
		return true;
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NQueenProblem Queen= new NQueenProblem();
		Queen.solveNQ();
		
		

	}

}
