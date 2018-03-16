package bankLoans;

public class CarLoans {
	
	///Car Loans Info///
	
		private int age;
		private int loanAmount;
		private int carPrice;
		private boolean employedStatus = true;
		private boolean driverLicense = true;
		
		public CarLoans (int age, int loanAmount, int carPrice, boolean emloyedStatus, boolean driverLicense) {
		
			this.driverLicense = true;
			this.employedStatus = true;
			this.age = age;
			this.loanAmount = loanAmount;
			this.carPrice = carPrice;
			
			}

			public boolean gerEmployedStatus() {
			return this.employedStatus;
		
			}public boolean gerDriverLicense() {
			return this.driverLicense;
		
			}public int getAge() {
			return age;
			
			} public int getLoanAmount() {
			return loanAmount;
		
			} public int gerCarPrice() {
			return  carPrice;
					
	}
}
  
