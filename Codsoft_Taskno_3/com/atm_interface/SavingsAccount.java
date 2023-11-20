package com.atm_interface;
//package Assignment2;

import java.util.Scanner;

public class SavingsAccount extends AccountClass {
	

	 Scanner scanner=new Scanner(System.in);
	 @Override
		void deposit() {

		System.out.println("Enter a deposit amount:");
		double amount=scanner.nextDouble();
		if(amount>0)
		{
			
			setSavingsAccountBalance(getSavingsAccountBalance() + amount);
			
		}
		
		System.out.println("After deposit:"+AccountClass.getSavingsAccountBalance());
		
	}
	
    @Override
	void withdraw() {
    	
    	System.out.println("Enter a withdraw amount:");
		double amount=scanner.nextDouble();
		if(getSavingsAccountBalance()>=amount ) 
		{
			
			setSavingsAccountBalance(getSavingsAccountBalance() - amount);
			
			System.out.println("After Withdraw "+getSavingsAccountBalance());
			
			/*if(getSavingsAccountBalance()>amount ||getSavingsAccountBalance()<=amount){
				
				System.out.println("You should have maintain ");
				
			}*/
		}
		else
			System.out.println("----You entered Insufficient Amount---\n"+
		                       "Try again");
	}

	@Override
	void getBalance() {
		
	System.out.println("Account Balance "+getSavingsAccountBalance());
		
	}
	
}
