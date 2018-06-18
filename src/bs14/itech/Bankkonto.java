package bs14.itech;
public class Bankkonto {
	
	String customername;
	long blz;
	long accountNr;
	double balance;
	
	public Bankkonto (String provCustomername) {
		customername = provCustomername;
		blz = 20050588;
		accountNr = (int) (Math.random() * 10001);
		balance = 0;
	}
	
	
	public void einzahlen(double betrag) {
		if (betrag > 0) {
			balance = balance + betrag;	
		}
	}
	
	public void auszahlen(double betrag) {
		if (betrag <= balance) {
			balance = balance - betrag;	
		}
	}
	
	public String showData() {
		return customername + " hat Konto " + accountNr + " und aktuellen Saldo: " + balance;
	}
}
