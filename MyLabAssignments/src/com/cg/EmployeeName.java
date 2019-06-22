package com.cg;

import java.util.Scanner;

public class EmployeeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner sc=new Scanner(System.in);
               try
               {
            	   String namepattern="[A-Za-z]*+[ ]*";
            	   System.out.println("Enter First Name");
            	   String firstName=sc.nextLine();
            	   System.out.println("Enter Last Name");
            	   String lastName=sc.nextLine();
            	   //throws an object of user defined exception
            	   if(firstName.equals(" ") || (!firstName.matches(namepattern)))
            	   {
            		   throw new MyException("Enter First Name");
            	   }
            	   if(firstName.equals(" ") || (!lastName.matches(namepattern)))
            	   {
            		   throw new MyException("Enter Last Name");
            	   }
            	   else
            	   {
            		   System.out.println("Successfully Implemented");
            	   }
               }
            	   catch(MyException ex)
            	   {
            		   System.out.println("Invalid Name Entered");
            		   System.out.println(ex.getMessage());
            	   }
               }
	}
	class MyException extends Exception
	{
		public MyException(String s) {
			super(s);
		}
	}

	
