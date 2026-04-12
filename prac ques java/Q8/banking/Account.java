package banking;

public class Account {

    public void showPublic() {
        System.out.println("Public method");
    }

    protected void showProtected() {
        System.out.println("Protected method");
    }

    private void showPrivate() {
        System.out.println("Private method");
    }

    public void displayPrivate() {   //  wrapper
        showPrivate();
    }

    public void displayProtected() { 
        showProtected();
    }
}