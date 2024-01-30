package dLithe;

import java.util.Scanner;

public class LastDigit 
{
	public boolean lastDig(int num1, int num2)
	{
		return num1%10==num2%10;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int num1=sc.nextInt(),
				num2=sc.nextInt();
		sc.close();
		System.out.println("LastDigit("+num1+", "+num2+")->"+new LastDigit().lastDig(num1, num2));
				
	}
}
