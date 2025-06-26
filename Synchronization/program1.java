class BankAccount {
    private int balance = 1000;

    // Synchronized method
    public synchronized void withdraw(int amount, String name) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining: " + balance);
        } else {
            System.out.println(name + " - Insufficient balance!");
        }
    }
}

class Customer extends Thread {
    BankAccount account;
    String customerName;

    Customer(BankAccount account, String name) {
        this.account = account;
        this.customerName = name;
    }

    public void run() {
        account.withdraw(700, customerName);
    }
}

public class program1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, "Alice");
        Customer c2 = new Customer(account, "Bob");

        c1.start();
        c2.start();
    }
}
