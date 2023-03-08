package oving7;



public class SavingsAccount implements Account {

    protected double balance;
    protected double renteFot;

    public SavingsAccount(double balance, double renteFot) {
        deposit(balance);
        this.renteFot = renteFot;
    }

    public SavingsAccount(double renteFot) {
        this.renteFot = renteFot;
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Can't deposit less than 0!");
        }
        this.balance += amount;
        

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Can't withdraw less than 0!");
        }
        if ((balance - amount) <= 0) {
            throw new IllegalStateException("Can't withdraw more than what's on balance!");
        }

        balance -= amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    public void endYearUpdate() {
        double increaseDouble = balance * renteFot;
        balance += increaseDouble;
    }



    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount(200, 0.5);
        System.out.println(account1.getBalance());
        account1.endYearUpdate();
        System.out.println(account1.getBalance());
        
    }

    
}
