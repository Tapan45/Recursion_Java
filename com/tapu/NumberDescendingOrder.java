 package com.tapu;
     // print 5 to 1 
public class NumberDescendingOrder {
	public static void Printnum(int n) {
		
		if (n==0) {
			return;
		}
		System.out.print(n);
		Printnum(n-1);
	}
	public static void main(String[]args) {
		
		int n=5;	
	Printnum(n);
	}
}
