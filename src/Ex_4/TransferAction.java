package Ex_4;

public class TransferAction {
    private double transactionAmount;
    public TransferAction (double amount){
        if (amount > 0) {
            this.transactionAmount = amount;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    public boolean tranferIntoAccount(Account from, Account to) {
        double damand = from.getAmount() - transactionAmount;
        if (damand >= 0) {
            from.setAmount(damand);
            to.addAmount(transactionAmount);
            return true;
        } else {
            return false;
        }
    }
    public double getTransactionAmount() {
        return transactionAmount;
    }


}
