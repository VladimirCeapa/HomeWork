package homework_nr_17;

public class Withdraw implements Runnable{
    BankAccount bankAccount;
    double amount;

    public Withdraw(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}

