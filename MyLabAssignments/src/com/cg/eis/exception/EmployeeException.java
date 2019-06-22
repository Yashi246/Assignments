package com.cg.eis.exception;

import java.util.Scanner;



public class EmployeeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         try
         {
        	 System.out.println("Enter the Salary of Employee");
        	 int salary=sc.nextInt();
        	//throws an object of user defined exception
        	 if(salary<3000)
        	 {
        		 throw new MyException("Salary should be above 3000");
        	 }
        	 else 
        	 {
        		 System.out.println("Successfully Implemented");
        	 }
         }
         catch(MyException ex)
    	   {
    		   System.out.println("Invalid Salary Entered");
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
	


