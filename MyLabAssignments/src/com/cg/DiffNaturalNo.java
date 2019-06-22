package com.cg;

import java.util.Scanner;

public class DiffNaturalNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the Value of n ");
	     int a=sc.nextInt();
	     
	     System.out.println("the sum of first n natural numbers is:"+calculateDifference(a));

		
		
	}
public static int calculateDifference(int n)
{
	int sqsum=0,sum=0,sumsq=0;
	
		for(int i=1;i<=n;i++)
		{
			int t=i*i;
			sqsum=sqsum+t;
			sumsq=sumsq+i;
			
		}
	sum=sqsum-(sumsq*sumsq);
	return sum;
}
}
