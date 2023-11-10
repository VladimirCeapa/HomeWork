package homework_nr_17;

public class main {
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
