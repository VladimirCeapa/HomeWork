package homework_nr_17;

public class main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(1000);

        Thread t1 = new Thread(new BankAccount.ThreadWithdraw());
        Thread t2 = new Thread(new BankAccount.ThreadDepozit());
        Integer index =0;
        t1.setName("deposit");
        t2.setName("withdraw");


        t2.start();
        t1.start();


        switch (Thread.currentThread().getName()){
            case "deposit":
                transfer(account1, account2, 1000);
            case "withdraw":
                transfer(account1, account2, 500);

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread());
        }

        account2.getBalance();
        account1.getBalance();
    }

    public static void transfer(BankAccount depozit, BankAccount withdraw, double amaunt) {
        if (withdraw.getDeposit()<amaunt){
            System.out.println("Sorry no money");
        }else{
            depozit.deposit(amaunt);
            withdraw.withdraw(amaunt);
        }


    }
}




