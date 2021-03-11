import java.util.UUID;

public class Main {
	
	public static void main(String [] args) {
		SavingAccount sa = new SavingAccount();
		System.out.println(sa.toString());
		sa.depositMoney(50.0);
		System.out.println(sa.toString());
		
		PersonalAccount pa = new PersonalAccount();
		System.out.println(pa.toString());
		pa.depositMoney(200.0);
		System.out.println(pa.toString());
		
	}

}
