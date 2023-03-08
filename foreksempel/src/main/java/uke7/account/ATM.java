package uke7.account;

public class ATM  {

    public void withdraw(Account account, int amount) { // noe som er en account, altså en klasse som bruker interfacet Account

        try { // try catch for å håndtere unntak, slik at koden ikke crasher
            int money = account.withdraw(amount); // kaller 

            if (money > 0) {
                System.out.println("ATM: Du fikk tatt ut " + money);
            }
        } catch (Exception e) {

            System.out.println("Figma balls, unntak i ATM.withdrawal: "  + e.getLocalizedMessage());
        }
        
    }

    public void deposit(Account account, int amount) {
        account.deposit(amount); // trenger bare å kalle deposit for genrelle accounter
    }

    public void getBalance(Account account) {

        if (account instanceof BonusAccount) {  // hvis account er en bonusAccount
            BonusAccount ba = (BonusAccount) account;  // gjør om "this account" til bonusaccount
            System.out.println("(ATM BA) Kredittgrense: " + ba.getCredit()); // bare for bonusaccount
        }
        System.out.println("ATM: balance: " + account.getBalance()); // printer ut for alle
    }



    public static void main(String[] args) {
        ATM atm = new ATM();
        RegularAccount ra = new RegularAccount();
        ra.deposit(1000);
        System.out.println(ra);
        atm.withdraw(ra, 500);
        System.out.println(ra);
    }
    
}
