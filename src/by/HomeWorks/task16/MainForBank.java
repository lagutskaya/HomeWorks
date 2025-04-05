package by.HomeWorks.task16;

import by.HomeWorks.task16.Exceptions.AccountNotFoundException;
import by.HomeWorks.task16.Exceptions.NotEnoughMoneyException;

public class MainForBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("id-1", "BYN-1", "BYN", 1000);
        Account account2 = new Account("id-2", "BYN-2", "BYN", 5000);
        Account account3 = new Account("id-3", "USD-1", "USD", 200);
        Account account4 = new Account("id-4", "USD-2", "USD", 3000);
        Account account5 = new Account("id-5", "BYN-3", "BYN", 15000);


        bank.accounts.add(account1);
        bank.accounts.add(account2);
        bank.accounts.add(account3);
        bank.accounts.add(account4);
        bank.accounts.add(account5);

        try {
            bank.transferMoney("BYN-1", "BYN-2", 2.0);
            System.out.println("Перевод выполнен успешно.");
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }

        try {
            bank.transferMoneyUSD("BYN-1", "BYN-2", 100.0, 3.2);
            System.out.println("Перевод выполнен успешно.");
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }
    }
}
