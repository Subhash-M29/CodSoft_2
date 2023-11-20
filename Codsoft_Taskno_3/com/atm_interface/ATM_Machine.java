package com.atm_interface;


import java.util.Scanner;

public  class ATM_Machine  {
	
		
		public static void main(String[] args) {
			
		System.out.println("Welcome to XYZ ATM");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your pin");
		short pin=scanner.nextShort();
		SavingsAccount savingacc=new SavingsAccount();
		CurrentAccount currentacc=new CurrentAccount();
		
        int i=1;
		  	
			do 
				{
				
				System.out.println("\nChoose a account \n1.Saving Account\n"+
		                           "2.Current Account");
				
				int choice=scanner.nextInt();
			    switch( choice) 
			      
			     {
							
				  case 1 :
				
					  	do{
					  			System.out.println("Enter your Choice for transaction");
					  			System.out.println("1.D-Deposit Amount\n"+
					                    "2.W-Withdraw Amount\n"
				     			       );  
					   
					  	 switch(scanner.next().charAt(0)) 
					     {
					    
							case '1':
						    System.out.println("Initial accountBalance:"+AccountClass.getSavingsAccountBalance()); 
							
						    System.out.println("Deposit Amount");
						   //savingacc.setDeposit(scanner.nextDouble());
							savingacc.deposit();
							
							
							break;
							
							case '2':
							
							System.out.println("withdraw Amount");
							savingacc.withdraw();
						
							break;
							/*default :
						    System.out.println("Press 0 to exit or 1 to continue from Saving Account");
						    i=scanner.nextInt();
						    break;*/
							
					     } System.out.println("Press 0 to exit or 1 to continue from Saving Account");
						    i=scanner.nextInt();
					     
				        } while(i==1);
					  	
					  	System.out.println("------------------------------");
					  	savingacc.getBalance();
					  	System.out.println("SuccessFull Transaction\n"+
						                      " Thank you & Visit again");
					     
					    
				break;
				case 2:
				
				     
					 do {
		                		System.out.println("1.Enter your choiec for transaction \n"+
		                        "1.Deposit Amount\n"+
			                    "2.W-Withdraw Amount\n");
		           
			         	switch(scanner.next().charAt(0)) 
			         
			         	{ 
			         
			                case '1':
			                	
			                System.out.println("Initial accountBalance:"+AccountClass.getCurrentAccountBalance()); 
				
			          		System.out.println("Deposit amount");
			        	 	currentacc.deposit(); 
			        	 	
			        	 	break;
			          		case '2':
			        	 	System.out.println("withdrawAmount");
			        	 	currentacc.withdraw();
			        	 	break;
				
				
			            }
			         	System.out.println("Press 0 to exit or 1 to continue from Current Account");
					    i=scanner.nextInt();
				     
		                }while(i==1);
				
					 	System.out.println("------------------------------");
					 	currentacc.getBalance();
					 	System.out.println("Success Full Transaction\n"+
				                      " Thank you & Visit again");
			     
				    break;
				
				
			     }
			  
				       System.out.println("------------------------------");
				       System.out.println("Press 0  to exit or press 1 for Select the Accounts");
				       i=scanner.nextInt();
				       
				
		    }  while(i==1);
				

	}
}
		
		



