package homework_nr_17;

public class Depozit implements Runnable{
        BankAccount bankAccount;
       double amount;

    public Depozit(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
        public void run() {
            bankAccount.deposit(amount);
        }
    }

