package com.cg;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the Value of num ");
	     int a=sc.nextInt();
	     if(checkNumber(a))
	     {
	    	 System.out.println("The number is not in increasing order");
	     }
	     else
	     {
	    	 System.out.println("The number is in increasing order");
	     }
	}
public static boolean checkNumber(int num)
{
	boolean flag=false;
	int currentdigit=num%10;
	num=num/10;
	while(num>0)
	{
		if(currentdigit<num%10)
		{
			flag=true;
			break;
		}
		currentdigit=num%10;
		num=num/10;
	}
	return flag;
}
}
