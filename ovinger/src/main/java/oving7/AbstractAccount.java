package oving7;

public abstract class AbstractAccount {

    protected double balance;

    public AbstractAccount(double balance) {
        this.balance = 0;
    }

    public AbstractAccount() {
        
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Can't deposit less than 0!");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Can't withdraw less than 0!");
        }
        internalWithdraw(amount);
    }

    public abstract void internalWithdraw(double amount);

    public double getBalance() {
        return this.balance;
    }

    


}
