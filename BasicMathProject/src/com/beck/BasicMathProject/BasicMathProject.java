package com.beck.BasicMathProject;
import java.util.Scanner;


public class BasicMathProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanme = new Scanner(System.in);
		
		System.out.println("Enter Your First Number");
		
		System.out.println("Enter Your Second Number");

		System.out.println("Press 1 to add, 2 to subtract, 3 to multiply, 4 to divide");
		 
	}
	
	public static int addemup(int x, int y)
	{
		int z = x + y;
		return z;
	}
	public static int subtractemdown(int x, int y)
	{
		int z = x - y;
		return z;
	}
	public static int multiplymethod(int x, int y)
	{
		int z = x * y;
		return z;
	}
	public static int dividetwonumbers(int x, int y)
	{
		int z = x / y;
		return z;
	}

}
