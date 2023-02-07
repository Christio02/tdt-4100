package oving2;

public class Account {
    private double balance;
    private double interestRate;

    // constructor
    public Account(double balance, double interestRate) {
        if (balance < 0 || interestRate < 0) {
            throw new IllegalArgumentException("Balance or interest-rate cannot be negative!");
        }
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() { // returns balance
        return this.balance;
    }

    public double getInterestRate() { // returns interest-rate
        return this.interestRate;
    }

    public void setInterestRate(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Interest-rate cannot be negative!");
        }
        this.interestRate = value;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit cannot be negative!");

        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw negative amount!");

        }

        else if (this.balance - amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw from negative balance!");
        } else {
            this.balance -= amount;
        }

    }

    public void addInterest() {
        balance += ((balance * interestRate) / 100);
    }

    @Override
    public String toString() {
        return "Balance: " + balance + " " + "Interestrate:" + " " + interestRate;
    }

    public static void main(String[] args) {
        Account p = new Account(200, 2);
        System.out.println(p);
        p.withdraw(201);
        System.out.println(p);

    }

}
