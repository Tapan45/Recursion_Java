package com.tapu;

public class printNum1to5 {
public static void printNum(int n) {
	if (n==6) {
	return;}
	System.out.print(n);
	printNum(n+1);
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
             int n=1;
             printNum(n);
	}

}
