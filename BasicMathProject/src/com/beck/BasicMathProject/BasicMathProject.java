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
		int number1 = scanme.nextInt();
		System.out.println("Enter Your Second Number");
        int number2 = scanme.nextInt();
		System.out.println("Press 1 to add, 2 to subtract, 3 to multiply, 4 to divide");
		int choice =scanme.nextInt();
		
		if (choice == 1)
		{
			int answer = addemup(number1, number2);
			System.out.println(answer);
		}
		if (choice == 2)
		{
			int answer = subtractemdown(number1, number2);
			System.out.println(answer);
		}
		if (choice == 3)
		{
			int answer = multiplymethod(number1, number2);
			System.out.println(answer);
		}
		if (choice == 1)
		{
			int answer = dividetwonumbers(number1, number2);
			System.out.println(answer);
		}
	//test comment
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
