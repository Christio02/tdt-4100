package uke7.account;

public class BonusAccount implements Account {

    private int balance;
    private int maxCredit = -1000;
    
    
    
    
    
    @Override
    public int getBalance() {
        
        return balance;
    }

    @Override
    public int withdraw(int amount) {
        if ((balance - amount) >= maxCredit) {
            balance -= amount;
            return amount;
        }
        throw new IllegalStateException("Du forsøker å ta ut mer enn du har!!!!");
    }

    @Override
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }


    @Override
    public String toString() {
        return
            "BonusAccount= '" + getBalance() + "'" + " og" + " Credit: " + maxCredit ;
    }

    public int getCredit() {
        return maxCredit;
    }

    
}
