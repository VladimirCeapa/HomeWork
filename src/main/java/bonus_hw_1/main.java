package bonus_hw_1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //Creating a list of accounts
        List<BankAccount> bankAccountList = new ArrayList<>();

        //We can initialize a new list, for example, VIP clients
        List<BankAccount> bankAccountListOfVIP = new ArrayList<>();
        bankAccountListOfVIP.add(new BankAccount("99999999", "Ciub", 1000000));

        // We can fill the entire database at once
        bankAccountList.add(new BankAccount("11111111", "Sidorov", 6000));
        bankAccountList.add(new BankAccount("77777777", "Midorov", 6000));
        bankAccountList.add(new BankAccount("78787878", "Bigorov", 6000));
        Bank bank = new Bank();

        // Add New Accounts
        bank.newAccounts(bankAccountList, "55555555", "Petrov", 1000);
        bank.newAccounts(bankAccountList, "22222222", "Ivanov", 2000);
        bank.newAccounts(bankAccountList, "33333333", "Silivanov", 3000);

        //By replacing our list we can add new clients
        bank.newAccounts(bankAccountListOfVIP,"14517894","Ungureanu",50000);

        //Deposit Transaction
        DepositTransaction depositTransaction = new DepositTransaction(0);
        depositTransaction.process(bankAccountList.get(1), 1000);
        depositTransaction.process(bankAccountList.get(0), 7000);
        depositTransaction.process(bankAccountList.get(2), 300);
        depositTransaction.process(bankAccountListOfVIP.get(0),80000);

        //Withdrawal Transaction
        WithdrawalTransaction withdrawalTransaction = new WithdrawalTransaction(0);
        withdrawalTransaction.process(bankAccountList.get(0), 1010);
        withdrawalTransaction.process(bankAccountList.get(1), 1010);
        withdrawalTransaction.process(bankAccountList.get(2), 1010);

        //Check for errors since the write-off amount cannot exceed the balance amount
        withdrawalTransaction.process(bankAccountListOfVIP.get(0),8000000);

        //Checking Balance
        bankAccountList.get(0).checkingBalance();

        //Checking visual output of the account number with "******"
        System.out.println(bankAccountList.get(1).getAccountNumber());

        //Checking full info bank
        bank.fullInfoBankList(bankAccountList);
    }
}