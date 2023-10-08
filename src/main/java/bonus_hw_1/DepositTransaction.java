package bonus_hw_1;

public  class DepositTransaction implements Transaction {

int summa=0;


    public DepositTransaction( int summa) {
        this.summa = summa;
    }


    @Override
    public   void process(BankAccount bankAccount,int summa) {
       bankAccount.depositingMoney(summa);
    }
}

