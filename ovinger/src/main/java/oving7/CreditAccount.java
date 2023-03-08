package oving7;

public class CreditAccount extends AbstractAccount {

    private double creditLine;

    public CreditAccount(double creditLine) {
        super();
        setCreditLine(creditLine);
    }

    public double getCreditLine() {
        return this.creditLine;
    }

    public void setCreditLine(double newCreditLine) {
        if (newCreditLine < 0) {
            throw new IllegalArgumentException("Can't set creditline to less than 0!");
        }

        if (this.balance < 0 && this.balance + newCreditLine < 0) {
            throw new IllegalStateException("New credit line is not enough to cover existing negative balance!");
        }

        this.creditLine = newCreditLine;
    }



    @Override
    public void internalWithdraw(double amount) {
        if (amount > this.balance + this.creditLine) {

            throw new IllegalStateException("Withdrawal exceeds credit line!");
        }

        this.balance -= amount;

       
    }

    public static void main(String[] args) {

        CreditAccount credit = new CreditAccount(10000);
        credit.setCreditLine(5000);
        credit.withdraw(4000);
        System.out.println(credit.getCreditLine());

        
    }
    
}
