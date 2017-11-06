package main.java.com.multicurrencymoney;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }


}
