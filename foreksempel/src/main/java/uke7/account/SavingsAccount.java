package uke7.account;

public class SavingsAccount implements Account {

    private int balance;
    private int withdrawals;
    private int maxWithdrawals = 2;




    @Override
    public int getBalance() {
        
        return balance;
    }

    @Override
    public int withdraw(int amount) {
        if (withdrawals == maxWithdrawals) {
            throw new IllegalStateException("Du forsøker å ta ut flere ganger enn du har lov til!");
        }

        withdrawals += 1;
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("SavingsAccount. Gjenværende antall uttak: " + withdrawals);
            return amount;
        }

        if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw 0 amount!");
        }
        return 0;

    }

    @Override
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount: " + balance + " og" + " uttak igjen:" + (maxWithdrawals - withdrawals);
    }
    
}
