package oving7;

public class DebitAccount extends AbstractAccount {



    // public DebitAccount(double balance) {
    //     super(balance);
    // }
    
    public DebitAccount() {
        super(0.0);
    }

    @Override
    public void internalWithdraw(double amount) {
       if ((balance - amount) < 0) {
        throw new IllegalStateException("Cannot withdraw! Balance is less than 0!");
       }
       this.balance -= amount;
    }


    public static void main(String[] args) {
        DebitAccount debit = new DebitAccount();

        debit.deposit(200);
        debit.withdraw(50);

        System.out.println(debit.getBalance());
    }


  
    
}
