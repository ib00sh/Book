package Ex_4;

public class TransferAction {
    private double transactionAmount;
    public TransferAction (double amount){
        if (amount > 0 && amount < 100) {
            this.transactionAmount = amount;
        }
        else if(amount >= 100){
            this.transactionAmount = amount - holdPercent(amount);
            System.out.println("Взимается процент при переводе: " + holdPercent(amount));
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    public boolean tranferIntoAccount(Account from, Account to) {
        double damand = from.getAmount() - transactionAmount ;
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

    public double holdPercent (double amount) {
        double percent = amount * 0.01;
        return percent;

    }


}
