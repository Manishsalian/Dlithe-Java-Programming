package dLithe;
import java.util.Scanner;
class Functions
{
	public boolean passCheck(String pass)
	{
		
			if(pass.length()>8 && pass.matches(".*[A-Z].*")
					&& pass.matches(".*[a-z].*") 
					&& pass.matches(".*[0-9].*") 
					&& pass.matches(".*[^a-zA-Z0-9].*") 
					&& (!pass.matches(".*\s+.*")))
			{
				return true;
			}
			else
			{
				return false;
			}	
		
	}
}
public class Password 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the password");
		String pass=new Scanner(System.in).next();
		if(new Functions().passCheck(pass))
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Invalid password");
		}
		
	}
}
