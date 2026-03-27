class Notifier {

    public void send(String message) {
        System.out.println("SMS: " + message);
        sendMail(message);
    }

    protected void send(String message, String num) {
        System.out.println("SMS with number: " + message + " and number is " + num);
    }

    private void sendMail(String mail) {
        System.out.println("Mail: " + mail);
    }

    public void displaySend() {
        send("Hello from Notifier");
    }
}

class AppNotifier extends Notifier {

    @Override
    protected void send(String message, String num) {
        System.out.println("App message: " + message + " and number is " + num);
    }

    private void sendGmail(String gmail) {
        System.out.println("Gmail: " + gmail);
    }

    public void displayAppSend() {
        send("HI BRO", "9876543210");
    }
}

public class Notifications {
    public static void main(String[] args) {
        AppNotifier u = new AppNotifier();
        u.send("Hello");
        u.send("Hi", "1234567890");
        u.displaySend();
        u.displayAppSend();
    }
}