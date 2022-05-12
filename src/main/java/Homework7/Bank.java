package Homework7;

import java.util.Scanner;

public class Bank{
    private User[] account;
    public Scanner input = new Scanner(System.in);
    private int count = 0;

    public User[] getAccount() {
        return account;
    }
    public void setAccount(User[] account) {
        this.account = account;
    }

    public Bank(){
        setAccount(new User[1]);
    }

    public Bank(User[]account){
        setAccount(account);
    }

    public void printAccounts() {
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null)
                System.out.println("The customer UID " + (i + 1) + account[i].toString());
        }
    }

    public void removeAccount() {
        System.out.println("Select which User to remove from the list: ");
        printAccounts();
        int index = input.nextInt();
        if(index-1<0 || index-1>=account.length){
            System.out.println("User does not exist :(");
            return;
        }
        account[index - 1] = null;
        for (int i = index - 1; i < account.length - 1; i++) {
            if (account[i + 1] != null) {
                account[i] = account[i + 1];
                account[i + 1] = null;
            }
        }
        count--;
        decraseArrSize(account);
    }

    public void decraseArrSize(User[] user){
        User[] tempArray = new User[account.length - 1];
        for (int i = 0; i < account.length - 1; i++) {
            tempArray[i] = account[i];
        }
        account = tempArray;
    }

    public void addAccount(User user){
        if(user.cash<0){
            System.out.println("Sorry. It's impossible to add account with negative balance.");
            System.out.println("Please try again.");
            return;
        }
        if(user.age<0 || user.age>150){
            System.out.println("Sorry. Invalid user age.");
            System.out.println("Please enter correct data.");
            return;
        }
        if(user.age>=0 && user.age<=17){
            System.out.println("Sorry but you have to be an adult to use our system.");
            return;
        }
        increaseArrSize(account);
        account[count]=user;
        count++;
    }

    public void increaseArrSize(User[] user){
        User[] tempArray = new User[account.length+1];
        for (int i = 0; i < account.length; i++) {
            tempArray[i] = account[i];
        }
        account = tempArray;
    }

    public  void putMoney(){
        System.out.println("Select Account index: ");
        printAccounts();
        int index = input.nextInt();
        if(index>count||index<=0){
            System.out.println("Incorrect User ID");
            return;
        }
        System.out.println("How much money you want to add?");
        int money=input.nextInt();
        if(money<0){
            System.out.println("Please enter the correct value.");
            return;
        }
        if(money == 0){
            System.out.println("It doesn't make sense.");
        }

        account[index-1].putMoney(money);

    }

    public  void withDraw(){
        System.out.println("Select the User from which you want to withdraw money:");
        printAccounts();
        int index = input.nextInt();
        System.out.println("Choose the amount of cash");
        int money = input.nextInt();
        if(index>count||index<=0){
            System.out.println("Incorrect User ID");
            return;
        }
        if(account[index-1].cash < money){
            System.out.println("Withdrawal is impossible as account don't have money.");
            return;
        }
        else {
            account[index-1].withdrawMoney(money);
        }
    }

    public void transact(){
        System.out.println("Select Which User want's to transfer money: ");
        printAccounts();
        int index1 = input.nextInt();
        if(index1>count||index1<=0){
            System.out.println("Incorrect User ID");
            return;
        }
        System.out.println("Select the receiver: ");
        int index2 = input.nextInt();
        if(index2>count||index2<=0){
            System.out.println("Incorrect User ID");
            return;
        }
        if(index1 == index2){
            System.out.println("The same user was selected. Transaction failed.");
            return;
        }
        if(account[index1-1].cash<1){
            System.out.println("Transaction is impossible because account don't have enough money.");
            return;
        }
        System.out.println("How much you want to transfer?");
        int amount = input.nextInt();
        if(amount> account[index1-1].cash){
            System.out.println("Not enough money to do transaction. Please enter correct data.");
            return;
        }
        else {
            account[index1 - 1].transferMoney(amount, account[index2 - 1]);
        }
    }
}
