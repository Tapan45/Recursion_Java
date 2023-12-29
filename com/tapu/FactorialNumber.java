package com.tapu;

public class FactorialNumber {
	 static int fact=1;
	public static void main(String[]args) {
		int no =5;
		FactorialNumber ob=new FactorialNumber();
		ob.calculateFact(no);
		System.out.println("factorial no is"+no+fact);
	}
     void calculateFact(int no)
     {
    	 if(no>=1) {
    	 fact=fact*no;
    	 calculateFact(no-1);
     }
     }
}
