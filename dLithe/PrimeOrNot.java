package dLithe;

import java.util.Scanner;

public class PrimeOrNot 
{
	public static boolean isPrimary(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count>=2)
			return false;
		
		return true;

	}
	public static void main(String[] args) 
	{
		System.out.println("Enter two numbers ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(),
		 num2=sc.nextInt();
		if(isPrimary(num1) && isPrimary(num2))
		{
			System.out.println(isPrimary(num1+num2));
		}	
		
	}
}
