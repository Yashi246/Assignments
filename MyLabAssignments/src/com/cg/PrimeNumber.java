package com.cg;

import javax.swing.JOptionPane;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int a;
		int p;
		input=JOptionPane.showInputDialog("enter the integer value");
		a=Integer.parseInt(input);
		for(int i=2;i<a;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0) {
				JOptionPane.showMessageDialog(null, +i);
				System.out.println(i);
			  }
			}
	
	}

}
