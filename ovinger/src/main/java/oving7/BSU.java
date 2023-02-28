package oving7;

public class BSU extends SavingsAccount {

    private double amountYear; // amount to deposit each years
    private double treshold; // treshold for maximing uttak

    public BSU(double renteFot, double amountYear) {
        super(renteFot);
        this.amountYear = amountYear;
    
    }

    public double getTaxDeduction() {
        double toDouble = this.balance * 0.2;
        return this.balance - toDouble;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Can't deposit less than 0!");
        }

        if ((amount + balance) > amountYear) {
            throw new IllegalStateException("Can't deposit more than the limit year!");
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

    public static void main(String[] args) {
        BSU account1 = new BSU(0.05, 25000);
        account1.deposit(10000);
        account1.deposit(20000);
        account1.endYearUpdate();
        
        System.out.println(account1.getBalance());
    }
    
}
