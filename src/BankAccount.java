import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.Serializable;
import java.math.BigDecimal;

/*V1:
 public class BankAccount implements Serializable {
 private static final long serialVersionUID = 1L;
 private String id;
 private BigDecimal totalDeposits;
 private BigDecimal totalWithdrawls;
 private transient String lastOp;

 public BankAccount(String id) {
 setCode(id);
 totalDeposits = BigDecimal.ONE;
 totalWithdrawls = BigDecimal.ZERO;
 setLastOp("create");
 }

 private void setCode(String id) {
 this.id = id;
 setLastOp("set code");
 }

 public void deposit(BigDecimal bigDecimal) {
 totalDeposits = totalDeposits.add(bigDecimal);
 setLastOp("deposit");
 }

 private void setLastOp(String string) {
 lastOp = string;
 }

 public void withdraw(BigDecimal bigDecimal) {
 totalWithdrawls = totalWithdrawls.add(bigDecimal);
 setLastOp("withdraw");
 }

 @Override
 public String toString() {

 return id + " " + getBalance().toString() + " " + lastOp;
 }

 private BigDecimal getBalance() {
 setLastOp("balance");
 return new BigDecimal(totalDeposits.subtract(totalWithdrawls).toString());
 }

 }*/

public class BankAccount implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private BigDecimal balance;
	private transient String lastOp;

	public BankAccount(String id) {
		setCode(id);
		balance = BigDecimal.ONE;
		setLastOp("create");
	}

	private void setCode(String id) {
		this.id = id;
		setLastOp("set code");
	}

	public void deposit(BigDecimal bigDecimal) {
		balance = balance.add(bigDecimal);
		setLastOp("deposit");
	}

	private void setLastOp(String string) {
		lastOp = string;
	}

	public void withdraw(BigDecimal bigDecimal) {
		balance = balance.subtract(bigDecimal);
		setLastOp("withdraw");
	}

	@Override
	public String toString() {
		return id + " " + getBalance().toString() + " " + lastOp;
	}

	private BigDecimal getBalance() {
		setLastOp("balance");
		return balance;
	}

	private void readObject(ObjectInputStream oi) throws Exception {
		GetField f = oi.readFields();
		id = (String) f.get("id", null);
		Object b = f.get("balance", null);
		if (b != null) {
			balance = (BigDecimal) b; // V2
		} else { // V1
			balance = (BigDecimal) f.get("totalDeposits", BigDecimal.ZERO);
			balance = balance.subtract((BigDecimal) f.get("totalWithdrawls", BigDecimal.ZERO));
		}
	}

}
