package Homework7;

public class User {
    protected String name;
    protected String surName;
    protected int age;
    protected int cash;

    public User(String name, String surName, int age, int cash){
        setName(name);
        setSurname(surName);
        setAge(age);
        setCash(cash);
    }

    public User() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }
    public void setSurname(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getCash() {
        return cash;
    }
    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return  "{" +
                "Name='" + name + '\'' +
                ", Surname='" + surName + '\'' +
                ", Age='" + age + '\'' +
                ", Cash=" + cash + '\'' +
                '}';
    }

    public void putMoney(int money){
        if(money<0){
            System.out.println("Incorrect value.");
            return;
        }
        cash = cash + money;
        System.out.println("Money added successfully.");
    }

    public void withdrawMoney(int money){
        if(money<0){
            System.out.println("Action impossible.");
            return;
        }
        cash = cash - money;
        System.out.println("Money transferred to your hand.");
    }

    public void  transferMoney(int money, User user){
        if(money<0){
            System.out.println("Action impossible.");
            return;
        }
        this.withdrawMoney(money);
        user.putMoney(money);
        System.out.println("Money successfully transferred.");
    }
}
