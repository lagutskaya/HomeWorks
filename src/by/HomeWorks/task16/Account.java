package by.HomeWorks.task16;

import java.util.Objects;

public class Account {
    private String id;
    private String number;
    private String currency;
    private double balance;

    public Account(String id, String number, String currency, double balance) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public String setNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number && Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }

    @Override
    public String toString() {
        return "Счет" +
                "валюта='" + currency + '\'' +
                ", id='" + id + '\'' +
                ", номер счета=" + number +
                ", баланс=" + balance +
                '}';
    }
}
