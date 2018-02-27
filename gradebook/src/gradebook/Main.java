package gradebook;


import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
		
	    String student1;
	    String student2;
	    String student3;
	    String student4;
	    String student5;
	    
	    
		double gradeStudent1;
		double gradeStudent2;
		double gradeStudent3;
		double gradeStudent4;
		double gradeStudent5;
		
		
		System.out.println("Enter the first and last name of the first student:");
		String Studenta1 = sc.next();
		System.out.println("Write the grade of the first student:");
		gradeStudent1 = new Scanner(System.in).nextDouble();
		
		System.out.println("Enter the first and last name of the second student:");
		String Studenta2 = sc.next();
		System.out.println("Write the grade of the second student:");
		gradeStudent2 = new Scanner(System.in).nextDouble();
		
		System.out.println("Enter the first and last name of the third student:");
		String Studenta3 = sc.next();
		System.out.println("Write the grade of the third student:");
		gradeStudent3 = new Scanner(System.in).nextDouble();
		
		System.out.println("Enter the first and last name of the fourth student:");
		String Studenta4 = sc.next();
		System.out.println("Write the grade of the fourth student:");
		gradeStudent4 = new Scanner(System.in).nextDouble();
		
		System.out.println("Enter the first and last name of the fifth student:");
		String Studenta5 = sc.next();
		System.out.println("Write the grade of the fifth student:");
		gradeStudent5 = new Scanner(System.in).nextDouble();
		
		
		
		double SumOfAllGrades = gradeStudent1 + gradeStudent2 + gradeStudent3 + gradeStudent4 + gradeStudent5;
		
		
		System.out.println("Class of the Mrs.James:");
		
		System.out.println("Student -" + "student1" + " the grade is " + gradeStudent1);
		System.out.println("Student -" + "student2" + " the grade is " + gradeStudent2);
		System.out.println("Student -" + "student3" + " the grade is " + gradeStudent3);
		System.out.println("Student -" + "student4" + " the grade is " + gradeStudent4);
		System.out.println("Student -" + "student5" + " the grade is " + gradeStudent5);
		
		
		
		
		System.out.println("The total sum of the grades is:" +  SumOfAllGrades);
		
	
		
		
			
	
		}
	}
}
