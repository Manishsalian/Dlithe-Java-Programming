package dLithe;

import java.util.Scanner;

public class In1020 
{
	public boolean in1020(int num1,int num2)
	{
		return num1>=10 && num1<=20 || 
				num2>=10 && num2<=20?true:false;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the 2 numbers");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(),
				num2=sc.nextInt();
		sc.close();
		System.out.println("in1020("+num1+", "+num2+")->"+new In1020().in1020(num1, num2));
	}
}
