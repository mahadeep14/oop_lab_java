class Bank{
	void deposit(double amount){
	System.out.println("deposited amount:"+amount);
	}
	void deposit(String check,double amount){
	System.out.println("check number:"+check);
	System.out.println("amount:"+amount);
	}
	void deposit(double amount, String transactionId, String bankName){
	System.out.println("amount:"+amount);
	System.out.println("TransactionId:"+transactionId);
	System.out.println("bankName:"+bankName);
	}
}
public class BankTransaction{
	public static void main(String []args){
	Bank n = new Bank();
	System.out.println("------offline deposit----");
	n.deposit(647578);
	System.out.println("-------- deposit with check book----");
	n.deposit("687345603487",37487);
	System.out.println("------online deposit----");
	n.deposit(43436.56,"73485698365","SBI");
	}
}