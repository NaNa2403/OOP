package lab5.part1.ex6;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            another.credit(amount);
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
