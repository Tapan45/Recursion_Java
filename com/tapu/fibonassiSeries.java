package com.tapu;

public class fibonassiSeries {
static int a=0,b=1,c;
	public static void main(String[] args) {
		System.out.println(a+""+b);
		fibonassiSeries ob=new fibonassiSeries();
		ob.fibbcall(10);

	}
	void fibbcall(int i) {
		if (i>=1) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			
			fibbcall(i-1);
		}
	}

}
