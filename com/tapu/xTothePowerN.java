package com.tapu;

public class xTothePowerN {
	public static int calcPower(int x,int n) {
		if (n==0) {
			return 1;
		}
		if (x==0) {
			return 0;
		}
		 int XtoPNm1=calcPower(x,n-1);
		 int XtoPN=x*XtoPNm1;
		 return XtoPN;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;int n=5;
	int ans=calcPower(x,n);
	System.out.println(ans);
			
	}

}
