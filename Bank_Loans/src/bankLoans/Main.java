package bankLoans;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			////Cash Loans
			
			int age1 = 18;
			int yearsOfService = 1;
			int salary = 300;
			boolean employed = true;
			
			System.out.println("=====Online request for a bank loan====");
			
			System.out.println("Select the type of loan you want to apply: //cash//, //housing//, or //car//?");
			String loanType = sc.next();
			
			if (loanType.equals("cash")) {
			
				System.out.println("What is your name?");
				String clientName = sc.next();
				System.out.println("Is your surname?");
				String clientSurName = sc.next();
				System.out.println("How old are you?");
				int Age1 = sc.nextInt();
				System.out.println("How old are you working years?");
				int YearsOfService = sc.nextInt();
				System.out.println("Amount of your salary?");
				int Salary = sc.nextInt();
				System.out.println("Are you employed? Answer with: true or false.");
				boolean Employed = sc.nextBoolean();
				
				if(Age1 >= 18 && YearsOfService >= 1 && Salary >= 300 && Employed == true) {
					System.out.println("Your cash loan is ACCEPTED");
				}else 
					System.out.println("Your cash loan is NOT ACCEPTED");
				
				System.out.println("==========================================================================================================");
				
				System.out.println("Your village's data for cash loan is ---Name: " + clientName + "; Surname: " + clientSurName + "; Years: "  + Age1 + "; Years of service: " + YearsOfService + "; Salary: " + Salary + "; State of employment: " + Employed);
			}
		}
	}
}

