package homework_nr_17;

import static homework_nr_8.main.line;

public class BankAccount {

    private double accountDeposit;

    public double getDeposit() {

        return accountDeposit;
    }


    public BankAccount(double deposit) {
        this.accountDeposit = deposit;
    }


    public synchronized void withdraw(double amount) {
        if (this.accountDeposit < amount) {
            System.out.println("Sorry no money");

        } else {
            this.accountDeposit = accountDeposit - amount;
            System.out.println("The transaction was successful");
        }

    }

    public synchronized void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Incorrectly entered amount");
            return;
        }
        this.accountDeposit += amount;
        System.out.println("The transaction was successful " );
    }

    public double getBalance() {
        return accountDeposit;

    }


}



