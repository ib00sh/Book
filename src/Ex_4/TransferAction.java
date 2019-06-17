package Ex_4;

public class TransferAction {
    private static double transactionAmount;
    private int id;
    public static boolean tranferIntoAccount(Account from, Account to) {
        double damand = from.getAmount() - transactionAmount ;
        if (damand >= 0) {
            from.setAmount(damand);
            to.addAmount(transactionAmount);
            return true;
        } else {
            return false;
        }
    }
    public void increaseAmount(){
        transactionAmount++;
    }


}
