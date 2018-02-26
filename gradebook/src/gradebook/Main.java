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
	    
	    
		double ocenaStudenta1;
		double ocenaStudenta2;
		double ocenaStudenta3;
		double ocenaStudenta4;
		double ocenaStudenta5;
		
		
		System.out.println("Upisi ime i prezime prvog studenta:");
		String Studenta1 = sc.next();
		System.out.println("Upisi ocenu prvog studenta:");
		ocenaStudenta1 = new Scanner(System.in).nextDouble();
		
		System.out.println("Upisi ime i prezime druog studenta:");
		String Studenta2 = sc.next();
		System.out.println("Upisi ocenu drugog sudenta:");
		ocenaStudenta2 = new Scanner(System.in).nextDouble();
		
		System.out.println("Upisi ime i prezime treceg studenta:");
		String Studenta3 = sc.next();
		System.out.println("Upisi ocenu treceg studenta:");
		ocenaStudenta3 = new Scanner(System.in).nextDouble();
		
		System.out.println("Upisi ime i prezime cetvrtog studenta:");
		String Studenta4 = sc.next();
		System.out.println("Upisi ocenu cetvrtog sudenta:");
		ocenaStudenta4 = new Scanner(System.in).nextDouble();
		
		System.out.println("Upisi ime i prezime petog studenta:");
		String Studenta5 = sc.next();
		System.out.println("Upisi ocenu petog studenta:");
		ocenaStudenta5 = new Scanner(System.in).nextDouble();
		
		
		
		double odgovor = ocenaStudenta1 + ocenaStudenta2 + ocenaStudenta2 + ocenaStudenta1 + ocenaStudenta1;
		
		
		System.out.println("Razred Gospodje Dzejms:");
		
		System.out.println("Student -" + "student1" + " njegova ocena je " + ocenaStudenta1);
		System.out.println("Student -" + "student2" + " njegova ocena je " + ocenaStudenta2);
		System.out.println("Student -" + "student3" + " njegova ocena je " + ocenaStudenta3);
		System.out.println("Student -" + "student4" + " njegova ocena je " + ocenaStudenta4);
		System.out.println("Student -" + "student5" + " njegova ocena je " + ocenaStudenta5);
		
		
		
		
		System.out.println("Zajednicki zbir ocena studenata je:" +  odgovor);
		
	
		
		
			
	
		}
	}
}
