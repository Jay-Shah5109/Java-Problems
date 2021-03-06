package com.DynamicProg;

public class LongestCommonSubsequence {
	
	
	int findmin(char[] X, char[] Y, int m, int n){
		if(m==0 || n==0){
			return 0;
		}
		if(X[m-1]==Y[n-1]){
			return 1+findmin(X, Y, m-1, n-1);
		}
		else{
			return max(findmin(X, Y, m-1, n),findmin(X, Y, m, n-1));
		}
	}
	
	int findminwithDynamicApproach(char[] X, char[] Y, int m, int n){
		
		int L[][]=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0 || j==0){
					L[i][j]=0;
				}
				else if(X[i-1]==Y[j-1]){
					L[i][j]=L[i-1][j-1]+1;
				}
				else
					L[i][j]=max(L[i-1][j], L[i][j-1]);
			}
		}
		return L[m][n];	
	}
	
	int max(int a, int b){
		return a>b?a:b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestCommonSubsequence lcs=new LongestCommonSubsequence();
		String s1="AGGTAB";
		String s2="GXTXAYB";
		
		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		
		int m=X.length;
		int n=Y.length;
		
		System.out.println("Length of LCS: "+lcs.findmin(X, Y, m, n));
		System.out.println("Length of LCS by Dynamic Approach: "+lcs.findminwithDynamicApproach(X, Y, m, n));

	}

}
