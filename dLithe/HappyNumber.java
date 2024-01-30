package dLithe;

import java.util.Scanner;

public class HappyNumber 
{
	public int happy(int num)
	{
		int sum=0;
		String[] str=Integer.toString(num).split("");
		for(int i=0;i<str.length;i++)
		{
			sum+=Math.pow(Integer.parseInt(str[i]),2);
			if(sum==1)
			{
				return sum;
			}
			else if(sum%4==0)
				return 0;
			else 
			{
				happy(sum);
			}
			
		}
		return sum;
		 
		
	}
	public static void main(String[] args) {
		System.out.println("Enter number");
		int num=new Scanner(System.in).nextInt();
		if(new HappyNumber ().happy(num)==1)
		System.out.println(true);
		else
			System.out.println(false);
		
	}
}
