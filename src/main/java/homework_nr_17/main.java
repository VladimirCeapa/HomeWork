package homework_nr_17;

public class main {
<<<<<<< HEAD

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




=======
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(100);
        BankAccount account2 = new BankAccount(100);

        Depozit depozit = new Depozit(account, 25);
        Withdraw withdraw = new Withdraw(account, 33);

        Thread threadDepozit = new Thread(depozit);
        Thread threadWithdraw = new Thread(withdraw);
        threadDepozit.start();
        threadWithdraw.start();

        System.out.println(account.getBalance()+ "  account");

        Thread t1 = new Thread(() -> Transfer.transfer(account, account2, 5));
        Thread t2 = new Thread(() -> Transfer.transfer(account2, account, 10));
        t1.start();
        t2.start();

        t1.join();
        t2.join();



        System.out.println(account.getBalance()+ "  accound");
        System.out.println(account2.getBalance()+ "  accound2");


    }


}
>>>>>>> origin/master
