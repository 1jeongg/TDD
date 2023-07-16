package org.example;

import java.util.Hashtable;

public class Bank {
    // 환율 저장
    private final Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();
    public Money reduce(Expression source, String to){
        return source.reduce(this, to);
    }
    public int rate(String from, String to){
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }
    public void addRate(String from, String to, int rate){
        rates.put(new Pair(from, to), rate);
    }
}
