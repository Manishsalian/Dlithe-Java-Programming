package dLithe;

import java.util.Scanner;

public class Prob1 
{
	public boolean sleepIn(boolean weekday,boolean vacation)
	{
//		return (weekday && vacation==false)?false:(weekday==false&&vacation==false)?true:true;
		return (!weekday ||vacation );
		
	}
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		boolean weekday,vacation;
		System.out.println("Enter wheather its weekday");
		weekday=sc.nextBoolean();
		System.out.println("Enter wheather it vacation");
		vacation=sc.nextBoolean();
		sc.close();
		if(new Prob1().sleepIn(weekday, vacation))
		{
			System.out.println("We can sleep");
		}
		
	}
}
