package Exception;

public class TestAccount {
	
public static void main (String[]args) {
	
	Account ac = new Account();
	ac.setBalance(2300.00);
	System.out.println("your current balance"+ ac.getBalance());
	
	ac.withdraw(100.00);
	
}

}
