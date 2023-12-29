package com.tapu;

public class fibbonasi {
	public static void printfibbo(int a,int b,int n) {
		if (n==0) {
			return;
		}
		int c=a+b;
		System.out.print(" "+c+" ");
		printfibbo(b,c,n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;int b=1;
		System.out.print(a+" "+b);
		int n=7;
		printfibbo(a,b,n-2);

	}

}
