package dLithe;

import java.util.Scanner;

public class SameNumbers 
{
	public int sumDouble(int num1,int num2)
	{
		return (num1==num2)?(num1+num2)*2:num1+num2;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt(),num2=sc.nextInt();
		sc.close();
		System.out.println("sumDouble("+num1+", "+num2+")->"+new SameNumbers().sumDouble(num1, num2));
	}
}
