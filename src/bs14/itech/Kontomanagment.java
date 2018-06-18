package bs14.itech;

public class Kontomanagment {

	private static Bankkonto account;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account = new Bankkonto("Peter Meier");
		System.out.println(account.showData());
		
		account.einzahlen(123.45);
		System.out.println(account.showData());
		account.auszahlen(88.88);
		System.out.println(account.showData());
		
	}

}
