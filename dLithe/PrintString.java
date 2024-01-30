package dLithe;

import java.util.Scanner;

public class PrintString {
	public StringBuilder stringTimes(String str,int num) //I am using StringBuilder because it is mutable 
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<num;i++)
		{
			sb.append(str);
		}
		return sb;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.next();
		System.out.println("Enter the number indicates how many time the string should be displayed");
		int num=sc.nextInt();
		sc.close();
		System.out.println(new PrintString().stringTimes(str, num));
		

	}

}
