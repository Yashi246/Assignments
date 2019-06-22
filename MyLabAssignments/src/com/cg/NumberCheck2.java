package com.cg;

import java.util.Scanner;

public class NumberCheck2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the Value of num ");
	     int a=sc.nextInt();
	     if(checkNumber(a))
	     {
	    	 System.out.println("The number is power of 2");
	     }
	     else
	     {
	    	 System.out.println("The number is not power of 2");
	     }
	}
	public static boolean checkNumber(int n)
	{
		if(n==0)
			return false;
		return (int)(Math.ceil((Math.log(n)/Math.log(2))))==(int)(Math.floor(((Math.log(n)/Math.log(2)))));
	}
}
