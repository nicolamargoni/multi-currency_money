package main.java.com.multicurrencymoney;

public abstract class Money {
    protected int amount;
    protected String currency;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    public String currency() {
        return currency;
    }

}
