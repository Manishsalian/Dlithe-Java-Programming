package dLithe;
import java.util.Scanner;
public class SwitchCase 
{
	public static String numInWords(int n)
	{
		switch(n)
		{
		case 1:return "one";
		case 2:return "two";
		case 3:return "three";
		case 4:return "four";
		case 5:return "five";
		case 6:return "six";
		case 7:return "seven";
		case 8:return "eight";
		case 9:return "nine";
		case 0:return "zero";
		}
		return "Wrong input";
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int num=new Scanner(System.in).nextInt();
		System.out.println(numInWords(num));
		switch(num)
		{
		case 1->System.out.println("one");
		case 2->System.out.println("one");
		}
		System.out.println(args.length);
	}
}
