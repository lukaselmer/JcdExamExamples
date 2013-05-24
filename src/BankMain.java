
public class BankMain {

	public static void Main() throws Exception {
		/*BankAccount ba = new BankAccount("001");
		ba.deposit(new BigDecimal("1.50"));
		ba.withdraw(new BigDecimal("3"));
		System.out.println(ba);*/
	
		MySerializer s = new MySerializer();
		//s.serialize(ba);
		
		BankAccount nba = (BankAccount) s.desierialize();
		System.out.println(nba);
	}

}
