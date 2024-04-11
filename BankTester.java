package bank_management_system;

import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) {

		Bank banker = new Bank();
		banker.addAccount("SA202413", "pravin","nashik", 4587290);
		banker.addAccount("SA202414", "pankaj", "mumbai", 5487240);
		banker.addAccount("SA202416", "prashant", "nsk", 4589760);
		banker.addAccount("SA202419", "punit", "pune", 54872745);
	
		System.out.println("-----WELCOME TO SBI-----");
		System.out.println("Select the role :\n1.Customer\n2.Banker");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		if (ch == 1) {
			System.out.println("Enter your name");
			String name = sc.next();
			for (int i = 0; i < banker.size; i++) {
				if (name.equalsIgnoreCase(banker.customer[i].getName())) {
					int choice;
					do {
					System.out.println("---------MENU----------");
					System.out.println("1.Display Details\t2.Withdraw\t3.Deposite\t4.Fund Transfer");
					choice = sc.nextInt();
					switch (choice) {
					case 1: {
						banker.customer[i].displayDetails();
						break;
					}
					case 2: {
						System.out.println("Enter amount to withdraw");
						double amt = sc.nextDouble();
						banker.customer[i].withdraw(amt);
						break;
					}
					case 3: {
						System.out.println("Enter amount to deposite");
						double amt = sc.nextDouble();
						banker.customer[i].deposit(amt);
						break;
					}
					case 4: {
						System.out.println("Enter the accNo for transfer");
						String accNo = sc.next();
						boolean flag=false;
						for (int k = 0; k < banker.size; k++) {
							if (accNo.equalsIgnoreCase(banker.customer[k].getaccNo())) {
								flag=true;
								System.out.println("Enter amount to transfer");
								double amt = sc.nextDouble();
								banker.customer[i].transferAmount(banker.account[k], amt);
								break;
							}
							
						}
						if(!flag)
						{
							System.out.println("not found");
						}

						break;
					}
					case 5: {
						
						break;
					}
					default:
					{
						System.out.println("You have entered wrong choice");
					}
					}
					}
					while(choice!=5);
				}
				else
				{
					
				}
				
			}

		} else {

		}

//		c1.deposit(5000);
//		c1.transferAmount(savingAccount1, 1000);
////		System.out.println(c1);
////		System.out.println(c2);
//		//c1.getAccountDetails();
//		c1.withdraw(2000);
//		c1.getAccountDetails();

//		banker.applyInterest(savingAccount1);
//		c2.getAccountDetails();
//		banker.addAccount("SA202413", "pravin","nashik", 4587290);
//		banker.addAccount("SA202414", "pankaj", "vasind", 5487240);
//		banker.addAccount("SA202416", "prashant", "nsk", 4589760);
//		banker.addAccount("SA202419", "punit", "pune", 54872745);
//		banker.displayDetails();
//		banker.removeBankAccount("SA202414");
//		System.out.println("After removing...");
//	
//		banker.updateDetails("SA202419", 582450);
//		banker.displayDetails();

	}

}
