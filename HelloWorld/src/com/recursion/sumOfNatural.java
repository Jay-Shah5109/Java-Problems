package com.recursion;

public class sumOfNatural {
	
	public int sumofnumbers(int n){
		if(n==1)
			return n;
		else
			return sumofnumbers(n-1)+n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		sumOfNatural newsum=new sumOfNatural();
		int ans=newsum.sumofnumbers(n);
		System.out.println(ans);
	}
}
