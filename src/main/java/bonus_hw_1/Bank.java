package bonus_hw_1;

import java.util.ArrayList;
import java.util.List;

import static homework_nr_8.main.line;

public class Bank {


    public static void main(String[] args) {
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new BankAccount("11111111", "Vetrov", 100));
        bankAccountList.add(new BankAccount("22222222", "Petrov", 400));
        bankAccountList.add(new BankAccount("33333333", "Letrov", 200));
        bankAccountList.add(new BankAccount("4444444", "Detrov", 300));
        //Deposit Transaction

        DepositTransaction depositTransaction = new DepositTransaction(0);
        WithdrawalTransaction withdrawalTransaction = new WithdrawalTransaction(0);
        depositTransaction.process(bankAccountList.get(0), 300);

        //Withdrawal Transaction
        withdrawalTransaction.process(bankAccountList.get(0), 1010);

        //Checking Balance
        bankAccountList.get(0).checkingBalance();
        System.out.println(bankAccountList.get(1).getAccountNumber());


        Bank bank = new Bank();
        bank.newAccounts(bankAccountList, "22222222", "Olegi", 200);
        bank.infoAccount(bankAccountList, "11111111");
        bank.infoAccount(bankAccountList, "23222222");
        bank.fullInfoBankList(bankAccountList);
    }


    public void newAccounts(List<BankAccount> bankAccountList, String accountNumber, String name, int balance) {
        bankAccountList.add(new BankAccount(accountNumber, name, balance));
    }

    public void infoAccount(List<BankAccount> inputBA, String an) {
        for (BankAccount element :
                inputBA) {
            if (element.getAccountNumber().equals(an)) {
                line();
                System.out.printf("Name    = %5s \nBalance = %s\n", element.getName(), element.getBalance());
                line();
            }
        }
    }

    public void fullInfoBankList(List<BankAccount> inputBA) {
        for (BankAccount element :
                inputBA) {
            line();
            System.out.printf("Name    = %5s  Balance = %s\n", element.getName(), element.getBalance());
            line();
        }

    }
}
