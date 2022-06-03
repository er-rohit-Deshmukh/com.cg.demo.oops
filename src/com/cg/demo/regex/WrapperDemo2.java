package com.cg.demo.regex;

public class WrapperDemo2 
{
	
	public static void main(String[] args)
	{

		// WAP to add two integers

		String input1 = "10";
		String input2 = "20";

		int num1 = Integer.valueOf(input1);
		int num2 = Integer.valueOf(input2);

		int num3 = num1 + num2; // arithmetic addition

		String output = Integer.toString(num3);

		System.out.println(output);
	}

}
