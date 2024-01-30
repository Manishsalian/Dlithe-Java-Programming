package dLithe;
import java.util.Scanner;
class MagicSumFunction{
	public int magicSum(int num1, int num2, int num3)
	{
		if(num1==13)
		{
			return 0;
		}
		else if(num2==13)
		{
			return num1;
		}
		else if(num3 == 13)
		{
			return num1+num2;
		}
		else 
		{
			return num1+num2+num3;
		}
		
	}
}
public class MagicSum 
{
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
		sc.close();
		System.out.println("The sum is "+new MagicSumFunction().magicSum(num1, num2, num3));
		
	}
}
