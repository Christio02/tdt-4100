package oving7;

public class SavingsAccount2 extends AbstractAccount {

    private int withdrawals;
    private double fee;

    public SavingsAccount2(int withdrawals, double fee) {
        super();
        this.fee = fee;
        this.withdrawals = withdrawals;

        
    }

    public int getWithdrawals() {
        return this.withdrawals;
    }

    @Override
    public void internalWithdraw(double amount) {
        if (this.balance - amount < 0) {
            throw new IllegalStateException("Balance cannot be negative after withdraw!");
        }

        else if (this.balance - (amount + fee) < 0) {
            throw new IllegalStateException("Can't withdraw, because fee and amount makes balance negative!");
        }
        
        else if (this.withdrawals < 1) {
            this.balance -= amount;
            this.balance -= this.fee;

        } else {
            this.balance -= amount;
            this.withdrawals -= 1;
        }
        

    }

    public static void main(String[] args) {
        SavingsAccount2 account2 = new SavingsAccount2(1, 50.0);
        account2.deposit(20000);
        account2.withdraw(5000);
        System.out.println(account2.getWithdrawals());
        System.out.println(account2.getBalance());
        account2.withdraw(10000);
        System.out.println(account2.getBalance());
        account2.withdraw(490);
        System.out.println(account2.getBalance());
    }
    
}
