public class Transaction {
    private String recipient;
    private String sender;
    private int amount;
    private boolean isComplete;
    private String bank;
    
    public Transaction(String sender, String recipient, int amount) {
        if (sender == null || recipient == null) throw new IllegalArgumentException("*** Sender eller modtager mangler!");
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        isComplete = false;
    }
    
    public void completeViaBank(String bank) {
        if (!bank.equals("Danske bank") && !bank.equals("Sydbank") && !bank.equals("Nordea")) {
            throw new IllegalBankException(bank);
        }
        this.bank = bank;
        isComplete = true;
    }
    
    public void notifyRecipient() throws IncompleteTransactionException {
        if (isComplete) {
            System.out.println("Informerer " + recipient + " om transaktion fra " + sender + " på " + amount + "kr (via " + bank + ").");
        }
        else throw new IncompleteTransactionException();
    }
    
    public void handleTransaction() {
        System.out.println("Vi håndterer nu din transaktion");
        try {
            
            notifyRecipient();
        }catch (IncompleteTransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}