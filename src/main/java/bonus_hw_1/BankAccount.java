package bonus_hw_1;

import java.util.List;

public class BankAccount {
 private String accountNumber;
   private   String name;
    private     int balance;
    static int numbersOfAccount;

    public BankAccount(String accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
         numbersOfAccount++;
    }

    public String getAccountNumber() {
        String changeVisualString="****";
        changeVisualString+=this.accountNumber.substring(3,7);

        return  "accountNumber is " +changeVisualString;
    }

    public void setAccountNumber(List<BankAccount> inputBankAccount,String accountNumber) {
        for (BankAccount element:
                inputBankAccount) {
            if (element.getAccountNumber().equals(accountNumber)) {
                System.out.println("Attention accountNumber already exists");
            }else {
               this.accountNumber=accountNumber;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


   public void depositingMoney(int i){
       balance+=i;
   };
public void withdrawingMoney(int i){
    if((balance-i)<0){
        System.out.println("Sorry, not enough funds!");
    }else{
        balance-=i;
    }
};
 public void checkingBalance(){
     System.out.printf("Name %s balance on card %d \n",getName(),getBalance());
 };
}

