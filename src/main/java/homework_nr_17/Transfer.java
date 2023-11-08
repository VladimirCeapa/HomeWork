package homework_nr_17;

public class Transfer extends Thread {


    public synchronized static void  transfer (BankAccount account, BankAccount account2, double amount){
        if ((account2.getBalance())<amount|| account.getBalance()<amount){
            System.out.println("error");
        }else {
            account.deposit(amount);
            account2.withdraw(amount);

        }
    }
}
