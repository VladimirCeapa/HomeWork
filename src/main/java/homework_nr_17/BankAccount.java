package homework_nr_17;

public  class  BankAccount  {


    private double accountDeposit;

    public static void main(String[] args) {
        BankAccount account = new BankAccount(55);
        account.getBalance();
        account.withdraw(50);
        account.deposit(200);
        account.getBalance();

    }


    public double getDeposit() {

        return accountDeposit;
    }


    public BankAccount(double deposit) {
        this.accountDeposit = deposit;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                ", deposit=" + accountDeposit +
                '}';
    }

    public void withdraw(double amount) {
        if (this.accountDeposit < amount) {
            System.out.println("Sorry no money");
        } else {
            this.accountDeposit = accountDeposit - amount;
            System.out.println("The transaction was successful");
        }

    }

    public void deposit(double amount) {
        if(amount<0){
            System.out.println("Incorrectly entered amount");
            return;
        }
      this.accountDeposit+=amount;
        System.out.println("The transaction was successful");
    }

    public void getBalance() {
        System.out.println(getDeposit());
    }

    static class  ThreadDepozit implements Runnable{
        public void run() {
            System.out.println(Thread.currentThread());
            }
        }

    public static class ThreadWithdraw implements Runnable {

        public void run() {
            System.out.println(Thread.currentThread());
        }
    }
}



