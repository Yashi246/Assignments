package com.cg;

import java.util.Scanner;

public class NaturalNo {


 public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Value of n ");
     int a=sc.nextInt();
     int add=calculateSum(a);
     System.out.println("the sum of first n natural numbers is:"+add);

}
 public static int calculateSum(int n) {
 int sum=0;
 if(n>=1)
 {
	 for(int i=1;i<=n;i++)
	 {
		 if(i%3==0 || i%5==0)
			 sum=sum+i;
		 else
			 sum=sum;
	 }
      return sum;

 }
 else
 {
	 System.out.println("Enter a valid number");
	 return 0;
 }
}
}
