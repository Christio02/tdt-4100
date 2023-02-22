package uke7.account;

public class RegularAccount implements Account {

    private int balance;

    

    public int getBalance() {
        return this.balance;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("RegularAccount: klarert for uttak.");
            return amount;
        }

        if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw 0 amount!");
        }
        return 0;
       
    }


    @Override
    public String toString() {
        return
            "RegularAccount='" + getBalance() + "'";
    }
    

    public static void main(String[] args) {
        RegularAccount ra = new RegularAccount();
        System.out.println(ra.getBalance());
        ra.deposit(1000);
        System.out.println(ra);
    }
}
