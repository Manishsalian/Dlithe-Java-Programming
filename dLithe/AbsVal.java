package dLithe;

import java.util.Scanner;

public class AbsVal 
{
	public double nearest(double a,double b)
	{
		return (Math.abs(10-a)<Math.abs(10-b))?a:(Math.abs(10-a)>Math.abs(10-b))?b:0;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		double a=sc.nextDouble(),
			   b=sc.nextDouble();
				
		System.out.println(new AbsVal().nearest(a, b));
		System.out.println(Math.round(5.5));
		sc.close();
	}
}
