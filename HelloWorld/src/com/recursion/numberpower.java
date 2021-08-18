package com.recursion;

public class numberpower {
	
	public int pow(int m, int n){
		if(n==0)
			return 1;
		else if(n%2==0)
			return pow(m*m,n/2);
		else
			return m*pow(m,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base=4;
		int raisedpower=5;
		numberpower num=new numberpower();
		System.out.println(num.pow(base, raisedpower));
		
	}
}
