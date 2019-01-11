package bank;

public class ATM {
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account sv1 = new SavingsAccount();
		
		sv1.setAccHolder("Terence");
		sv1.setBalance(5000);
		sv1.setPin(1234);
		
		
		sv1.deposit(578777);
		
		System.out.println(sv1.getBalance());
     	System.out.println(sv1.getAccHolder());
     	System.out.println(sv1.getPin());
     	System.out.println(sv1.getBalance()+ "  " +sv1.getAccHolder() + "  "+sv1.getPin());
     	
     	
     	
     	
     	
     	Account sv2 = new CurrentAccount();
     	
     	sv2.setAccHolder(sv1.getAccHolder());
     	sv2.setBalance(5000);
     	sv2.setPin(1234);
     	
     	
     	
     	System.out.println(sv2.getBalance());
     	System.out.println(sv2.getPin());
     	System.out.println(sv2.getAccHolder());
     	System.out.println(sv2.getBalance()+ "   " +sv2.getAccHolder() + "  "+sv2.getPin());
	}
	
}


	
	



