package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter your first number");
			int a = sc.nextInt();
			System.out.println("Enter your second number");
			int a1 = sc.nextInt();
			System.out.println("Now the system calculate the sum");
			int c = a + a1;
			
			System.out.println("First number is: " + a);
			System.out.println("Second number is: " + a1);
			System.out.println("Sum is: " + c);
			
			
			System.out.println("Enter your first number");
			int b = sc.nextInt();
			System.out.println("Enter your second number");
			int b1 = sc.nextInt();
			System.out.println("Now system calculate the difference");
			int c1 = b - b1;
			
			System.out.println("First number is:" + b);
			System.out.println("Second number is:" + b1);
			System.out.println("Difference is:" + c1);
			
			
			System.out.println("Enter your first number");
			int aa = sc.nextInt();
			System.out.println("Enter your second number");
			int aa1 = sc.nextInt();
			System.out.println("Now the system calculate the product");
			int cc = aa * aa1;
			
			System.out.println("First number is: " + aa);
			System.out.println("Second number is: " + aa1);
			System.out.println("Produc is: " + cc);
			
			
			System.out.println("Enter your first number");
			int bb = sc.nextInt();
			System.out.println("Enter your second number");
			int bb1 = sc.nextInt();
			System.out.println("Now the system calculate the quotient");
			int cc1 = bb / bb1;
			
			System.out.println("First number is: " + bb);
			System.out.println("Second number is: " + bb1);
			System.out.println("Quotient is: " + cc1);
			
			
			System.out.println("Enter your first number");
			int firstNumber = sc.nextInt();
			
			System.out.println("Choose your operation +, -, * or /");
			String operation = sc.next();
			
			System.out.println("Enter your second number");
			int secondNumber = sc.nextInt();
			
			System.out.println("Now system is calculating");
			int result = 0;
      
			if(operation.equals("+")) {
				result = firstNumber + secondNumber;
			} else if(operation.equals("-")) {
				result = firstNumber - secondNumber;
			} else if(operation.equals("*")) {
				result = firstNumber * secondNumber;		
			} else if(operation.equals("/")) {
				result = firstNumber / secondNumber;			
			}
     
			System.out.println("First number is: " + firstNumber);
			System.out.println("Second number is: " + secondNumber);
			System.out.println("The result is: " + result);
		}
	}
	
}