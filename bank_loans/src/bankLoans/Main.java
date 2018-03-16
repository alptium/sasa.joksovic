package bankLoans;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("============================================================");
			System.out.println("===============REQUEST FOR A BANK LOAN===============");
			System.out.println("============================================================");
			System.out.println("Select the type of loan you want to apply: ==cash==, ==car==?");
			
			Object detailsType = sc.next();
			if ("cash".equals(detailsType)) {
				runDemoCashLoans();
			}else if ("car".equals(detailsType)) {
				rundemoCarLoans();
				
		}
	}	
}				
						////Cash Loans///
				
				private static void runDemoCashLoans() {
					
					try(Scanner sc = new Scanner(System.in)) {
							
						System.out.println("What is your name?");
						String clientName = sc.next();
						System.out.println("Is your surname?");
						String clientSurName = sc.next();
						System.out.println("How old are you?");
						int ageClient = sc.nextInt();
						System.out.println("How old are you working years?");
						int workingYears = sc.nextInt();
						System.out.println("Amount of your salary?");
						int Salary = sc.nextInt();
						System.out.println("Are you employed? Answer with: true or false.");
						boolean Employed = sc.nextBoolean();
						
						if(ageClient >= 18 && workingYears >= 1 && Salary >= 300 && Employed == true) {
							System.out.println("Your cash loan is ACCEPTED");
						}else 
							System.out.println("Your cash loan is NOT ACCEPTED");
						
							System.out.println("==========================================================================================================");
						
							System.out.println("Your village's data for cash loan is ---Name: " + clientName + "; Surname: " + clientSurName + "; Years: "  + ageClient + "; Years of service: " + workingYears + "; Salary: " + Salary + "; State of employment: " + Employed);
					
	}
}	
									///Car loans///
				
						private static void rundemoCarLoans(){
							
							try(Scanner sc = new Scanner(System.in)) {
					
								System.out.println("What is your name?");
								String clientName = sc.next();
								System.out.println("Is your surname?");
								String clientSurName = sc.next();
								System.out.println("How old are you?");
								int ageClient = sc.nextInt();
								System.out.println("Loan Amount?");
								int loanAmount = sc.nextInt();
								System.out.println("Car Prices?");
								int carPrices = sc.nextInt();
								System.out.println("Are you employed? Answer with: true or false?");
								boolean employedStatus = sc.nextBoolean();
								System.out.println("Do you have a car license? Answer with: true or false?");
								boolean driverLicense = sc.nextBoolean();
							
								if(ageClient >= 18 && carPrices <= loanAmount && employedStatus  == true && driverLicense  == true) {
									System.out.println("Your car loan is ACCEPTED");
								}else 
									System.out.println("Your car loan is NOT ACCEPTED");
								
									System.out.println("==========================================================================================================");
									System.out.println("Your village's data for car loan is ---Name: " + clientName + "; Surname: " + clientSurName + "; Years: "  + ageClient + "; Loan Amount: " + loanAmount + "; Car Prices: " + carPrices + "; State of employment: " + employedStatus + "; State of car license: " + driverLicense);
								
						
		}
	}
}
