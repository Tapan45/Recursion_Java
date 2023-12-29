package com.tapu;

public class towerOfHanoi {
  public static void  towerofhanoi(int n,String src,String help,String dest) {
	  if (n==1) {
		  System.out.println("tranfer disk"+n+"from"+src+"to"+dest);
		  return;
	  }
	    towerofhanoi(n-1,src,dest,help);
	  System.out.println("tranfer disk"+n+"from"+src+"to"+dest);
	  towerofhanoi(n-1,help,src,dest);
	  }
	
public static void main(String[] args) {
		int n=3;
		 towerofhanoi(n,"S","H","D");	}

}
