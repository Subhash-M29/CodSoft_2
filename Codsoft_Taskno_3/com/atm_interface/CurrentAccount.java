package com.atm_interface;

import java.util.Scanner;

public class CurrentAccount extends AccountClass{
	
	Scanner scanner=new Scanner(System.in);
	private final double deductFee=5;
	
	@Override
	void deposit() 
	{
		
		System.out.println("Enter a deposit amount:");
		double amount=scanner.nextDouble();
		if(amount>0){
			setCurrentAccountBalance(getCurrentAccountBalance() + amount);
			System.out.println("After Deposit"+getCurrentAccountBalance());
		}
		else {
			System.out.println("You Entered Invalid Amount");
		}
		
	}

	@Override
	void withdraw() 
	{
		System.out.println("Enter a withdraw amount:");
		double amount=scanner.nextDouble();
		
		double fee=0;
		
		
		if(getCurrentAccountBalance()>=amount) {
			
			if(amount > 50000 ) {
				fee=deductFee(amount);  // Fee deduction applicable when withdraw Amount limit exceeds 50000,
				                         
			}
			else
				System.out.println("No fee detection");
			
			setCurrentAccountBalance((getCurrentAccountBalance()-amount)-fee);
			//setAccountBalance(accountBalance);
			
			System.out.println("After withdraw"+getCurrentAccountBalance());
		}
		else
			System.out.println("You entered Insufficient Amount\n"+
		                       "Try again");
		
		
	}
		public double deductFee(double amount) 
		{
			double fee=(amount/10000)*deductFee;
			System.out.println("Deduction Fee"+fee);
			return fee;
		}
		
		
		
		@Override
		void getBalance() 
		{
			
			System.out.println("Account Balance "+getCurrentAccountBalance());
			
	    }
}


