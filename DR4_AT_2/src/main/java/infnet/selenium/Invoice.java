package infnet.selenium;

public class Invoice {
    private String clientName;
    private String clientEmail;
    private double amount;
    private InvoiceType type;

    public Invoice(String clientName, String clientEmail, double amount, InvoiceType type) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.amount = amount;
        this.type = type;
    }

    public void process() {
        if (!isValidEmail()) {
            System.out.println("Invalid email. Sending failed.");
            return;
        }

        printHeaderDescription();
        String note = generateInvoiceNote();
        System.out.println(note);
        sendByEmail(clientEmail, note);
    }

    private boolean isValidEmail() {
        return clientEmail != null && clientEmail.contains("@");
    }

    private void printHeaderDescription() {
        System.out.println(type.getNoteDescription());
    }

    private String generateInvoiceNote() {
        return "--- INVOICE ---\n" +
                "Client: " + clientName + "\n" +
                "Amount: R$ " + String.format("%.2f", amount) + "\n" +
                "Type: " + type.getTypeLabel() + "\n" +
                "---------------------";
    }

    private void sendByEmail(String email, String content) {
        System.out.println("Sending email to: " + email);
        System.out.println("Content:\n" + content);
    }
}
