package dLithe;

import java.util.Scanner;

public class PasswordMatch 
{
	public int passCheck(String str)
	{
		
		if(str.length()>=8)
		{
			if(str.matches(".*\\d.*"))
			{
				if(str.matches(".*[A-Z].*"))
				{
					if(!(str.contains(" ")|| str.contains("/")))
					{
						
						if(!(Character.isDigit(str.charAt(0))))
						{
							return 1; 
						}
						else 
						{
							return 0;
						}
					}
				}
				else
				{
					return 0;
				}
			}
			else
			{
				return 0;
			}
		}
		else 
		{
			return 0;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("Enter the string");
		String str=new Scanner(System.in).nextLine();
		if(new PasswordMatch().passCheck(str)==1)
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Invalid password");
		}
	}
}
