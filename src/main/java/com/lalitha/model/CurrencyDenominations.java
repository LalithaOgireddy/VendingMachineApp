package com.lalitha.model;

public enum CurrencyDenominations {
    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100), TWOHUNDRED(200),
    FIVEHUNDRED(500), THOUSAND(1000);

    private int amount;

    CurrencyDenominations(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
