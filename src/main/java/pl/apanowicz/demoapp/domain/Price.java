package pl.apanowicz.demoapp.domain;

import pl.apanowicz.demoapp.dto.PriceDto;

import java.util.Objects;

public final class Price {

    private double amount;

    private Currency currency;

    public Price(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Price(PriceDto price) {
        this.amount = price.getAmount();
        this.currency = price.getCurrency();
    }

    public double getAmount(){
        return amount;
    }

    public Currency getCurrency(){
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price that = (Price) o;
        return Objects.equals(currency, that.currency) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public String toString() {
        return "Price{" +
                "amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
