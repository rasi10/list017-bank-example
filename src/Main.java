public class Main {
	
	public static void main(String [] args) {
		SavingAccount sa = new SavingAccount();
		System.out.println(sa.toString());
		sa.depositMoney(50.0);
		System.out.println(sa.toString());		
		
		
	}

}
