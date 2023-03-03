package oving7;

public class CreditAccount extends AbstractAccount {

    private double creditLine;

    public CreditAccount(double balance) {
        super(balance);
    }

    public double getCreditLine() {
        return this.creditLine;
    }

    public void setCreditLine(double newCreditLine) {
        if (newCreditLine < 0) {
            throw new IllegalArgumentException("Can't set creditline to less than 0!");
        }

        if (this.balance < 0 && this.balance + newCreditLine <0) {
            throw new IllegalStateException("New credit line is not enough to cover existing negative balance!");
        }

        this.creditLine = newCreditLine;
    }



    @Override
    public void internalWithdraw(double amount) {
        if (this.balance - amount < this.creditLine) {
            throw new IllegalStateException("Insufficient  funds and credit line!");
        }

       this.balance -= amount;

       
    }

    public static void main(String[] args) {

        CreditAccount credit = new CreditAccount(10000);
        credit.deposit(20000);
        credit.withdraw(5000);
        System.out.println( credit.getBalance());
        credit.withdraw(20000);


        
    }
    
}
