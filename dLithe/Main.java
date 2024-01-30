package dLithe;
import java.util.Scanner;
class Assignment2
{
	public int lotteryResult(int num1,int num2,int num3)
	{
		
		
		if(num1==num2 && num2==num3) 
			return 20;
		else if(num1!=num2 && num2!=num3 && num3!=num1) 
			return 0;
		else 
			return 10;
	}
}


public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter three numbers");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
		sc.close();
		System.out.println("The result of lottery is "+new  Assignment2().lotteryResult(num1, num2, num3) );
		
	}
}
