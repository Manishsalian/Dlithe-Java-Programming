package dLithe;

import java.util.Scanner;

public class SumOfTen 
{
	public boolean makes(int num1,int num2)
	{
		return (num1==10||num2==10)?true:(num1+num2==10)?true:false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(),
				num2=sc.nextInt();
		sc.close();
		System.out.println("makes("+num1+", "+num2+")->"+new SumOfTen().makes(num1, num2));
	}
}
