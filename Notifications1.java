class Notifier {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }

    protected void send(String sms, String num) {
        System.out.println("SMS with number: " + sms + " and the number is " + num);
    }

    private void sendMail(String outlookmail) {
        System.out.println("Mail: " + outlookmail);
    }

    public void displaySend() {
        send("Hello from Notifier");   
        send("Hi", "1234567890");      
        sendMail("outlook@mail.com");  
    }
}

class AppNotifier extends Notifier {

    @Override
    protected void send(String message, String num) {
        System.out.println("App Message: " + message + " and the number is " + num);
    }

    private void sendMail(String gmail) {
        System.out.println("Gmail: " + gmail);
    }
}

public class Notifications1 {
    public static void main(String[] args) {

        System.out.println("---- Notifier ----");
        Notifier n = new Notifier();
        n.displaySend();

        System.out.println("\n---- AppNotifier ----");
        AppNotifier app = new AppNotifier();

        app.send("Hello App");                 // public method
        app.send("Hello App User", "999999");  // overridden method

        // app.sendMail("test@gmail.com"); ❌ not accessible (private)
    }
}