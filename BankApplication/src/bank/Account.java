package bank;

public class Account {
	
	// attribute declaration

		public long Pin;
		public double balance ;
		public String AccHolder ;
		
		
		
		
		
	public long getPin() {
			return Pin;
		}

		public void setPin(long pin) {
			Pin = pin;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public String getAccHolder() {
			return AccHolder;
		}

		public void setAccHolder(String accHolder) {
			AccHolder = accHolder;
		}

	public Double withdraw(double balance)
	{
		
		this.balance = this.balance - balance;
		
		return this.balance;
	}
	
	public Double deposit(double balance)
	{
		
		this.balance = this.balance + balance;
		
		return this.balance;
	}
	
}
	
	
	
	
	
