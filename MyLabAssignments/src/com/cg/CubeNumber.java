package com.cg;

import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the Value of num ");
	     int a=sc.nextInt();
	     System.out.println("The sum of cubes of natural number is:"+cubeSum(a));
	}
	public static int cubeSum(int n)
	{
		int sum=0;
		
		
		while(n>0)
		{
			int i=n%10;
			sum=sum+i*i*i;
			n=n/10;
		}
		return sum;
		
		
	}

}
