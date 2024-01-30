package dLithe;

import java.util.Scanner;
class Function
{
	public boolean function(String pass)//manishsalian2405@gemail.com
	{
		if(pass.matches("^[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]+$"))
			return true;
		else
			return false;
	}
}
public class MyClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any name ");
		String name=new Scanner(System.in).next();
		if(new Function().function(name))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Not valid");
		}
		
			
	}
}


