public class Account {
    String id;
    String name;
    int balance = 0;

    Account(String id, String name) {
    }

    Account(String id, String name,  int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.print("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.debit (amount);
            another.credit (amount);
        } else {
            System.out.print("Amount exceeded balance");
        }
        return balance;
    }
    public String toString() {
        return "Account [id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + "]";
    }
}
