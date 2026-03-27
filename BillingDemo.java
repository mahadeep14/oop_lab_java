class InvoiceProcessor {

    public void generateInvoice(String customer, double amount) {
        double finalAmount = calculateAmount(amount);
        System.out.println("Invoice for " + customer);
        System.out.println("Amount: " + finalAmount);
    }

    private double calculateAmount(double amount) {
        System.out.println("Base calculation (no discount)");
        return amount;
    }
}

class RetailInvoice extends InvoiceProcessor {

    @Override
    public void generateInvoice(String customer, double amount) {
        double discountedAmount = applyDiscount(amount);
        System.out.println("Retail Invoice for " + customer);
        System.out.println("Discounted Amount: " + discountedAmount);
    }

    public double applyDiscount(double amount) {
        System.out.println("Applying retail discount (10%)");
        return amount * 0.9;
    }
}

public class BillingDemo {
    public static void main(String[] args) {
        InvoiceProcessor processor = new RetailInvoice();
        processor.generateInvoice("John Doe", 1000.0);
    }
}