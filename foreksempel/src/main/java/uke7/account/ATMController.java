package uke7.account;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ATMController {




    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new RegularAccount();

        atm.deposit(account, 500);
        atm.deposit(account, 500);
        atm.withdraw(account, 300);
        atm.withdraw(account, 300);
        atm.withdraw(account, 300);
        atm.withdraw(account, 300); // får ikke tatt ut 1200 kr
        atm.getBalance(account);


        Account account2 = new BonusAccount();
        atm.deposit(account2, 1000);
        atm.withdraw(account2, 1500);
        System.out.println(account2);
        atm.getBalance(account2);

        Account account3 = new SavingsAccount();
        atm.deposit(account3, 1000);
        atm.getBalance(account3);
        System.out.println(account3);
        atm.withdraw(account3, 300);
        System.out.println(account3);
        atm.withdraw(account3, 300);
        atm.withdraw(account3, 300);


        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(account2);
        accounts.add(account3);
        
        System.out.println("\n\n Her begynner listen: ");
        System.out.println(accounts);

        Collections.sort(accounts, new AccountComparator()); // Kaller collections for å sorte accounts med Comparator klassen
        System.out.println(accounts);


    }
    
}
