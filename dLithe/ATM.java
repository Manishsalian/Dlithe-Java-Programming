package dLithe;

import java.util.Scanner;

public class ATM 
{
	Scanner sc=new Scanner(System.in);
	static int balance=0;
	static String pin="1234";

	public void deposite()
	{
		int newbalance;
		while(true)
		{
			System.out.println("Enter the deposite balance");
			newbalance=sc.nextInt();
			if(newbalance>0&&newbalance%100==0)
			{
				balance=balance+newbalance;
				System.out.println(newbalance+" added to the account Then new balance is "+balance);
				break;
			}
			else
			{
				System.out.println("Enter a valid balance");
			}
		}
	}
	public void witdraw()
	{
		int withdrabal;
		boolean flag=false;
		if(balance>0)
		{
			while(true)
			{
				System.out.println("Enter the withdraw balance");
				withdrabal=sc.nextInt();
				if(withdrabal%100==0 && withdrabal>0)
				{
					if(withdrabal<=balance) {
						System.out.println("Yay transaction successfull withdrawed balance is"+withdrabal);
						System.out.println("The remaining balance is "+(balance-withdrabal));
						break;
					}
					else
					{
						System.out.println("No sufficient balance");
					}
					
				}
				else
				{
					System.out.println("balance is not multiple of 100");
				}
			}
		}
		else
		{
			System.out.println("Not sufficient balance");
		}
	}
	public void balanceEnquirey()
	{
		System.out.println("Yout balance is"+balance);
	}

	public void pinChange()
	{
		String newpin;
		while(true)
		{
			System.out.println("Enter new pin");
			newpin=sc.next();
			pin=newpin;
			if(newpin.length()==4)
			{
				System.out.println("Successfully changed");
				System.out.println("New pin is "+pin);
				break;
			}
			else
			{
				System.out.println("Wrong formate");
			}
			
		}
	}
	public static void main(String[] args) 
	{
		int choise = 0;
		String mypin;
		ATM a=new  ATM ();
		do
		{
			System.out.println("Enter the pin");
			 mypin=new Scanner(System.in).next();
			if(mypin.equals(pin))
			{
				System.out.println("1.deposite\n2.withdraw\n3.balance enquiery\n4.pin change\n5.Exit");
				choise=new Scanner(System.in).nextInt();
				switch(choise)
				{
				case 1->a.deposite();
				case 2->a.witdraw();
				case 3->a.balanceEnquirey();
				case 4->a.pinChange();
				default->System.out.println("wrong input");
				}
			}
			else
			{
				System.out.println("Please enter a valid pin");
			}
		}while(choise!=5);
	}
}
