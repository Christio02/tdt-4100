package oving1;

public class Account {

    private double balance = 0.0;
    private double interestRate = 0.0;

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public double deposit(double amount) {
        if (amount > 0.0) {
            return balance += amount;
        } else {
            return balance;
        }
    }

    public double setInterestRate(double value) {
        return interestRate += value;
    }

    public double addInterest() {
        return balance += ((balance * interestRate) / 100);
    }

    @Override
    public String toString() {
        return "Balance: " + balance + " " + "Interestrate:" + " " + interestRate;
    }

    public static void main(String[] args) {
    }

}
