package Homework7;

public class User {
    private String name;
    private String surName;
    private int age;
    private int cash;

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
        if(age>=0 && age <= 17){
            System.out.println("Sorry but you must be an Adult to use our Banking system :(");
            return;
        }
        if(age<0 || age>150){
            System.out.println("Incorrect age data. Please enter the correct value");
            return;
        }
        this.age = age;
    }

    public int getCash() {
        return cash;
    }
    public void setCash(int cash) {
        if(cash<0){
            System.out.println("Invalid cash amount. It can't be lower than 0.");
            return;
        }
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
