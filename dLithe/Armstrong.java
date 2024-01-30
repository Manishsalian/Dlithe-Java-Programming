package dLithe;

import java.util.Scanner;

public class Armstrong 
{
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  
            }
        }
        return true;  
    }
	public boolean armStrong(int num)
	{
		int sum=0;
		int num1=num;
		String str[]=Integer.toString(num).split("");
		//int length=str.length;
		for(int i=0;i<str.length;i++)
		{
			sum+=Math.pow(Integer.parseInt(str[i]),str.length);
		}
		return sum==num1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter two numbes ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			if(new Armstrong().armStrong(i))
			{
				sum+=i;
			}
		}
		System.out.println(isPrime(sum));
	}
}
