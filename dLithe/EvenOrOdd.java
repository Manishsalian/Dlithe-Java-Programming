package dLithe;

import java.util.Scanner;

public class EvenOrOdd 
{
	public  boolean even(int num)
	{
		return num%2==0;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		int num=new Scanner(System.in).nextInt();
		System.out.println("Even("+num+")->"+new EvenOrOdd().even(num));
			
	}
}
