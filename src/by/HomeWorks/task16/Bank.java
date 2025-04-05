package by.HomeWorks.task16;

import by.HomeWorks.task16.Exceptions.AccountNotFoundException;
import by.HomeWorks.task16.Exceptions.NotEnoughMoneyException;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    Set<Account> accounts = new HashSet<>();

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account accountFrom = findAccount(accountNumberFrom);
        Account accountTo = findAccount(accountNumberTo);

        if (accountFrom.getBalance() < amount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }

        accountFrom.setBalance(accountFrom.getBalance() - amount);
        accountTo.setBalance(accountTo.getBalance() + amount);
    }

    public void transferMoneyUSD(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate) {
        Account accountFrom = findAccount(accountNumberFrom);
        Account accountTo = findAccount(accountNumberTo);

        double amountInFromCurrency;
        if (accountFrom.getCurrency().equals("USD")) {
            amountInFromCurrency = amount * exchangeRate;
        } else {
            amountInFromCurrency = amount;
        }

        if (accountFrom.getBalance() < amountInFromCurrency) {
            throw new NotEnoughMoneyException("not.enough.money");
        }

        accountFrom.setBalance(accountFrom.getBalance() - amountInFromCurrency);
        accountTo.setBalance(accountTo.getBalance() + amount);
    }

    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotFoundException("not.found.account");
    }
}
