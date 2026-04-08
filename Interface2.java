interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class SBI implements Bank {
    double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class Interface2 {
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.deposit(500);
        obj.withdraw(300);
    }
}