package dLithe;

import java.util.Scanner;

public class Query 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the q value");
		int q=sc.nextInt();
		if(q>=0 && q<=500)
		{
			int [] a=new int[q];
			int [] b=new int[q];
			int [] n=new int[q];

			System.out.println("Enter value for a b and n");
			for(int i=0;i<q;i++)
			{
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
				n[i]=sc.nextInt();
			}
			int sum=a[0];
			for(int j=0;j<q;j++)
			{
				if(n[j]>=0 && n[j]<=15)
				{
					if(a[j]>=0 && a[j]<=50)
					{
						if(b[j]>=0 && b[j]<=50)
						{
							sum=a[j];
							for(int i=0;i<n[j];i++)
							{
								sum+=(Math.pow(2, i)*b[j]);
								System.out.print(sum+" ");
							}
							System.out.println();
						}
					}
				}
			}
		}
	}
}
