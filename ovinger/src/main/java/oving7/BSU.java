package oving7;


import java.util.ArrayList;
import java.util.List;


public class BSU extends SavingsAccount {

    private double amountYear; // amount to deposit each years
    private final double initialAmountYear;
    private List<Double> listOfDeposits = new ArrayList<>();

    public BSU(double renteFot, double amountYear) {
        super(renteFot);
        this.amountYear = amountYear;
        this.initialAmountYear = amountYear;
    
    }

    public double getTaxDeduction() {
        double sumOfDeposits = this.listOfDeposits.stream()
        .mapToDouble(deposits -> deposits.doubleValue()).sum();
        return sumOfDeposits * 0.2;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Can't deposit less than 0!");
        }


        if ((amount + balance ) > amountYear) {
            throw new IllegalStateException("Can't deposit more than the limit year!");
        }

        this.balance += amount;
        this.listOfDeposits.add(amount);

    }

    @Override
    public void endYearUpdate() {
        double increaseDouble = balance * renteFot;
        balance += increaseDouble;
        this.amountYear += initialAmountYear;

        this.listOfDeposits.clear();

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Can't withdraw less than 0!");
        }
        if ((balance - amount) <= 0) {
            throw new IllegalStateException("Can't withdraw more than what's on balance!");
        }

        double sumOfList = this.listOfDeposits.stream()
        .mapToDouble(deposits -> deposits.doubleValue()).sum();

        if (amount > sumOfList) {
            throw new IllegalStateException("Can't withdraw more than prevous year deposited!");
        }

        balance -= amount;
    }

    public static void main(String[] args) {
        BSU bsu = new BSU(0.05, 25000);
        bsu.deposit(20000);
        bsu.withdraw(5000);
        System.out.println(bsu.getBalance());
        bsu.endYearUpdate();
        System.out.println(bsu.getBalance());
    }

    
}
