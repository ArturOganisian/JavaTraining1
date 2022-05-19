package Homework9;
public class User {
    private int id;
    private String name;
    private String lastname;
    private int balance;

    public User() {
    }

    public User(int id, String name, String lastname, int balance) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return "User{Name='" + this.name + "', Lastname='" + this.lastname + ", balance=" + this.balance + "}";
    }
}