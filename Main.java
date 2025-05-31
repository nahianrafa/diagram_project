
package com.mycompany.projecttttt;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(1000.0);
        User user1 = new User("Alice", "1111222233334444", "1234", account1);
        bank.addUser(user1);

        Account account2 = new Account(2000.0);
        User user2 = new User("Bob", "1234567890", "4321", account2);
        bank.addUser(user2);

        ATM atm = new ATM(bank);
        atm.authenticateUser("1111222233334444", "1234");
        atm.showMenu();
        atm.performTransaction("1111222233334444", 1, 0); // Check Balance
        atm.performTransaction("1111222233334444", 2, 100); // Withdraw
        atm.performTransaction("1111222233334444", 3, 200); // Deposit
        atm.performTransaction("1111222233334444", 4, 150); // Transfer to Bob
    }
}
