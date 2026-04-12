class BankAccount{

private double balance;
private String name;

  BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
public double getbalance(){
	return balance;
}
public void displayname(){
System.out.println("Name:"+name);
}
public void deposit(double amount){
balance+=amount;
System.out.println("deposited:"+amount);

}
public void withdraw(double amount){
if(amount<=balance){
	balance-=amount;
	System.out.println("withdrawed:"+amount);
	System.out.println("balance left:"+balance);
}
else{System.out.println("insufficient amount");}
}

}
public class  Q9Bank{
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Mahadeep", 1000);

        acc.displayname();

        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Current Balance: " + acc.getbalance());
    }
}