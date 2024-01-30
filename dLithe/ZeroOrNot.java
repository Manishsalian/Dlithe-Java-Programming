package dLithe;

import java.util.Scanner;

public class ZeroOrNot
{
	public void pos(int n)
	{
		System.out.println("The positive number are");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(i+" ");
		}
	}
	public void neg(int n)
	{
		System.out.println("The negative number are number are");
		for(int i=n;i<=0;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		int n=new Scanner(System.in).nextInt();
		if(n>=Math.pow(-10, 3) && n<=Math.pow(10, 3))
		{
			if(n==0)
			{
				System.out.println("Already Zero");
			}
			else if(n>0)
			{
				new ZeroOrNot().pos(n);
			}
			else
			{
				new  ZeroOrNot().neg(n);
			}
		}
	}
}
