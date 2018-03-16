package bankLoans;

public class CashLoans {
	
		///Cash Loans Info///
	
	private int age1;
	private int yearsOfService;
	private int salary;
	private boolean employed = true;
	
	public CashLoans (int age1, int yearsOfService, int salary, boolean emloyed) {
	
		this.employed = true;
		this.age1 = age1;
		this.yearsOfService = yearsOfService;
		this.salary = salary;
			
		}

		public boolean getEmployed() {
		return this.employed;
	
		}public int getAge1() {
		return age1;
		
		} public int getYearsOfService() {
		return yearsOfService;
	
		} public int gerSalary() {
		return  salary;
				
	}
}
