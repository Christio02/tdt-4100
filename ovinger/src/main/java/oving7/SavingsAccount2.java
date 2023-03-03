package oving7;

public class SavingsAccount2 extends AbstractAccount {

    private int fee;

    public SavingsAccount2(int fee, double balance) {
        super(balance);
        this.fee = fee;

        
    }

    @Override
    public void internalWithdraw(double amount) {
       
    }
    
}
