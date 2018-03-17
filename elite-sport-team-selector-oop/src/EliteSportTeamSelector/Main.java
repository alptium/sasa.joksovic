package EliteSportTeamSelector;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
														
			System.out.println("Candidate form:");
			
			System.out.println("Your name is?");
			String candidateName = sc.next();		
			System.out.println("Your surname is?");
			String candidateSurname = sc.next();		
			System.out.println("age?");
			int age = sc.nextInt();		
			System.out.println("height?");
			float height = sc.nextFloat();		
			System.out.println("Do you have any injuries:true or false?");
			boolean injuries = sc.nextBoolean();
					
			if (age >= 16 && height > 150 && injuries == false) {
				System.out.println("The application is ACCEPTED");
				System.out.println("the candidate meets the requirements for our club");											
			} else {
					System.out.println("The application is REJECTED");
					System.out.println("the candidate does not meet the requirements for our club");				
			}
								
						System.out.println("Candidat -" + candidateName + " " + candidateSurname  +";  Age:" + age + "; Height:" + height + "; Candidate Injuries:" + injuries );
		}
	}															
}
				