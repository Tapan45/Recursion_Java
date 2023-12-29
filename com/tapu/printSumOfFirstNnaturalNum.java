package com.tapu;

public class printSumOfFirstNnaturalNum {

	public static void printSum(int i,int n,int sum) {
		if(i==n) {
			sum =sum+i;
			System.out.println(sum);
			return;
		}
		sum=sum+i;
		printSum(i+1,n,sum);
		
	}
	public void main(String[] args) {
		// TODO Auto-generated method stub
		printSum(1,5,0);
	

	}

}
