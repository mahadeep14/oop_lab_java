package bankingApp;

import banking.Account;

public class BankApp extends Account {

    public static void main(String[] args) {

        BankApp obj = new BankApp();

        obj.showPublic();         
        obj.showProtected();    
        obj.displayPrivate();      
        obj.displayProtected();   
    }
}