package dLithe;
import java.util.Scanner;

public class Prob2 
{
	public boolean prob2(int num1,int num2,int num3)
	{
		return (num1>=13 && num1<=19)||(num2>=13 && num2<=19)||(num3>=13 && num3<=19);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(),
				num2=sc.nextInt(),
				num3=sc.nextInt();
		sc.close();
		System.out.println(new Prob2().prob2(num1, num2, num3));
		
		
		
	}
}
