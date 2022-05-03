package miniproject;

import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String[] args) {
		while(true) {
	

	System.out.println("Welcome to SBI Bank");
	System.out.println("Enter your choice");
	System.out.println("To create Account Press::1");
	System.out.println("To create Deposite Money Press::2");
	System.out.println("To create Withdrow Money Press::3");
	System.out.println("To Cheak  Account  Balance Press::4");
	
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	
	switch (ch) 
	{
	case 1:
		System.out.println(" Account is Created");
		
		break;
	case 2:
		System.out.println(" Money is Deposited");
		
		break;
	case 3:
		System.out.println(" Money is Withdrow");
		
		break;
	case 4:
		System.out.println(" Account Balance is 100000");
		
		break;
		
	default:
		System.out.println("Thank for Banking");
		break;
	}
	
		}
}
}