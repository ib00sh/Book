package Ex_4;

public class Order {
    private int id;
    static int bonus;
    public final int MIN_TAX = 8 + (int)(Math.random()*5);
    public final static int PURSHASE_TAX = 6;

    public double calculatePrice(double price, int counter){
        double amount;
        amount = (price - bonus) * counter;
        double tax = amount * PURSHASE_TAX / 100;
        return amount + tax;
    }
}
