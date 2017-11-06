package main.java.com.multicurrencymoney;

public interface Expression {
    Money reduce(Bank bank, String to);
}
