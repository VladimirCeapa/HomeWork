package bonus_hw_1;

public class WithdrawalTransaction implements Transaction {

    int summa;

    public WithdrawalTransaction( int summa) {
        this.summa = summa;

    }


    @Override
    public void process(BankAccount bankAccount, int summa) {
        bankAccount.withdrawingMoney(summa);
    }
}
