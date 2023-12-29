package com.tapu;

public class factorial {

	public static int printfact(int n) {
		if (n==1 || n==0) {
			return 1;
		}
		int calNm1=printfact(n-1);
		int calN=n*printfact(n-1);
		return calN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		 int ans=printfact(n);
           System.out.println(ans);
	}

}
