package oving7;

public class ForeldreSpar extends SavingsAccount {

    private int maxWithdraws;
    private final int initialMaxWithdrawals;

    public ForeldreSpar(double renteFot, int maxWithdraws) {
        super(renteFot);
        this.maxWithdraws = maxWithdraws;
        this.initialMaxWithdrawals = maxWithdraws;
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

        if (maxWithdraws == 0) {
            throw new IllegalStateException("Cannot withdraw anymore, used up the max amount of withdrawals");
        }

        balance -= amount;
        maxWithdraws -= 1;
    }

    public int getRemainingWithdrawals() {
        return this.maxWithdraws;
    }

    @Override
    public void endYearUpdate() {
        double increaseDouble = balance * renteFot;
        balance += increaseDouble;
        maxWithdraws += initialMaxWithdrawals;
    }

    public static void main(String[] args) {
        ForeldreSpar spar = new ForeldreSpar(0.04, 3);
        spar.deposit(10000);
        spar.withdraw(1000);
        spar.withdraw(1000);
        spar.withdraw(1000);
        System.out.println(spar.getRemainingWithdrawals());
        spar.endYearUpdate();
        spar.withdraw(1000);
        System.out.println(spar.getRemainingWithdrawals());
        System.out.println(spar.getBalance());
    }
    
}
