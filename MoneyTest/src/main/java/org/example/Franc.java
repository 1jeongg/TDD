package org.example;

public class Franc extends Money {
    private String currency;
    public Franc(int amount, String currency) {
        super(amount, currency);
    }
    @Override
    public String currency() {
        return "CHF";
    }
    public Money times(int multiplier){
        return Money.franc(amount * multiplier);
    }
}
