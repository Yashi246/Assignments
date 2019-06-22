package com.cg;

import java.util.Scanner;

public class PersonAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         try
         {
        	 String agepattern="[1-9]*";
        	 System.out.println("Enter the age of the person");
        	 int age=sc.nextInt();
        	 String str1 =Integer.toString(age);
        	 //throws an object of user defined exception
        	 if(age<15||(!str1.matches(agepattern)))
        	 {
        		 throw new MyException("Enter a proper age");
        	 }
        	 else 
        	 {
        		 System.out.println("Successfully Implemented");
        	 }
         }
         catch(MyException ex)
  	   {
  		   System.out.println("Invalid Age Entered");
  		   System.out.println(ex.getMessage());
  	   }
	}

}
