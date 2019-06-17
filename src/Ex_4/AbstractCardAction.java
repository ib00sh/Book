package Ex_4;

public abstract class AbstractCardAction {
    private long account;
    public AbstractCardAction() {}

    public abstract void doPayment(double amountPayment);
    public void setAccount(Long account){
        this.account = account;
    }
}
