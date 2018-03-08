package gradebook;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter the first name of the first student:");
			String student1 = sc.next();
			System.out.println("Enter the surname of the first student:");
			String student1surname = sc.next();
			System.out.println("Write the grade of the first student:");
			double grade1 = sc.nextDouble();
							
			System.out.println("Enter the first name of the second student:");
			String student2 = sc.next();
			System.out.println("Enter the surname of the second student:");
			String student2surname = sc.next();
			System.out.println("Write the grade of the second student:");
			double grade2 = sc.nextDouble();
											
			System.out.println("Enter the first name of the third student:");
			String student3 = sc.next();
			System.out.println("Enter the surname of the thired student:");
			String student3surname = sc.next();
			System.out.println("Write the grade of the third student:");
			double grade3 = sc.nextDouble();
											
			System.out.println("Enter the first name of the fourth student:");
			String student4 = sc.next();
			System.out.println("Enter the surname of the fourth student:");
			String student4surname = sc.next();
			System.out.println("Write the grade of the fourth student:");
			double grade4 = sc.nextDouble();
											
			System.out.println("Enter the first name of the fifth student:");
			String student5 = sc.next();
			System.out.println("Enter the surname of the first student:");
			String student5surname = sc.next();
			System.out.println("Write the grade of the fifth student:");
			double grade5 = sc.nextDouble();
														
			double sumOfAllGrades = grade1 + grade2 + grade3 + grade4 + grade5;			
								
			System.out.println("Class of the Mrs.James:");
								
			System.out.println("Student -" + student1 + " " + student1surname  +" grade is " + grade1);
			System.out.println("Student -" + student2 + " " + student2surname  +" grade is " + grade2);
			System.out.println("Student -" + student3 + " " + student3surname  +" grade is " + grade3);
			System.out.println("Student -" + student4 + " " + student4surname  +" grade is " + grade4);
			System.out.println("Student -" + student5 + " " + student5surname  +" grade is " + grade5);
										
			System.out.println("The total sum of the grades is:" +  sumOfAllGrades);
																	
	}
		}
			}