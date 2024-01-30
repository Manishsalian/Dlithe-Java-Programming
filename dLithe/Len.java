package dLithe;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Len 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<5;i++)
		{
			n=sc.nextInt();
			sc.close();
			if(!(set.add(n)))
			{
				System.out.println("Repeated "+n);
				break;
			}
		}
		
		System.out.println("Done");
		
		//Math.ceil(n);
	}
}
