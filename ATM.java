package my_java_project;

import java.util.Scanner;

class Atm_Interface
{
	float balance = 100000f;
	Scanner sc = new Scanner(System.in);
	
	public void withdraw()
	{
		System.out.println("Enter the amount for withdraw : ");
		float amount = sc.nextFloat();
		try
		{
			if(balance >= amount)
			{
				balance = balance - amount;
				System.out.println(amount+" Withdraw Succesfully!");
				System.out.println("Current Amount is : "+balance);
			}
			else
			{
				System.out.println("Insufficient BALANCE available");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void diposite()
	{
		System.out.println("Enter the amount for diposite : ");
		float amount = sc.nextFloat();
		try
		{
			if(amount <= balance)
			{
				balance = balance + amount;
				System.out.println(amount+" Diposited succesfully!");
				System.out.println("Current Amount is  : "+balance);
			}
			else
			{
				System.out.println("Sorry!!! Only Limit of 100000");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Bank_ac extends Atm_Interface
{
	
	public void checkbalance()
	{
		System.out.println("Your current balance available is : "+balance);
	}
}
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pin;
	    System.out.println("Enter your PIN number,Here :");
		pin = sc.nextInt();
		 
		Bank_ac ac = new Bank_ac();
		System.out.println("Your Current Balance"+ac.balance);
	while(true)
	{
		System.out.println("");
		System.out.println("");
        System.out.println("WELCOME TO SBI ATM SERVICES");
        System.out.println("");
        //System.out.println("PLEASE,Select your valid choice");
        System.out.println("");
		System.out.println("1_WITHDRAW BALANCE");
		System.out.println("2_DIPOSITE BALANCE");
		System.out.println("3_CHECK BALANCE");
		System.out.println("4_EXIT");
		System.out.println("");
		System.out.println("Enter Your SERVICE Choice : ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			ac.withdraw();
			break;
		case 2:
			ac.diposite();
			break;
		case 3:
			ac.checkbalance();
			break;
		case 4:
			System.out.println("***THANK YOU FOR VISIT***");
			System.exit(0);
		case 5:
			default:System.out.println("INVALID CHOICE!!!");
		}
	}
	}

}
