package com.DynamicProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={10, 22, 9, 33, 21, 50, 41, 60, 80};
		int lis[]=new int[arr.length];
		Arrays.fill(lis, 1);
		
		int i,j;
		
		for(i=1 ; i<arr.length ; i++){
			for(j=0 ; j<i ; j++){
				if(arr[i]>arr[j] && lis[i]<=lis[j]){
					lis[i]=lis[j]+1;
				}
			}
		}
		int max=0,index=-1;
		for(i=0;i<lis.length;i++){
			if(lis[i]>max){
				max=lis[i];
				index=i;
			}
		}
		
		System.out.println("Maximum increasing subsequence length is: "+max);
		
		// To find the elements of LIS
		
		List<Integer> newlist=new ArrayList<>();
		int count=1,x=0;
		
		for(i=0;i<lis.length;i++){
			if(lis[i]==count){
				newlist.add(arr[i]);
				count++;
			}
		}
		
		for(int m: newlist){
			System.out.print(m+" ");
		}

}
}
