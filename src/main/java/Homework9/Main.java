package Homework9;

import java.util.Scanner;

public class Main {
    public static Bank[] banks = new Bank[]{new Bank(1, "Ineco", new User[10]), new Bank(2, "HSBC", new User[10]), new Bank(2, "Evoca", new User[10])};

    public Main() {
    }

    public static void main(String[] args) {
        boolean isFinished = false;

        while(!isFinished) {
            logMenu();
            Scanner scn = new Scanner(System.in);
            int choose = scn.nextInt();
            int bankId;
            int userId;
            int cash;
            switch(choose) {
                case 1:
                    logBanks();
                    bankId = scn.nextInt();
                    User user = new User();
                    System.out.println("Type your name");
                    user.setName(scn.next());
                    System.out.println("Type your lastname");
                    user.setLastname(scn.next());
                    addNewUser(user, bankId);
                    break;
                case 2:
                    logBanks();
                    System.out.println("Select your bank Id");
                    bankId = scn.nextInt();
                    System.out.println("Choose the user you want to remove");
                    logUsersByBankId(bankId - 1);
                    userId = scn.nextInt();
                    removeUser(userId - 1, bankId - 1);
                    break;
                case 3:
                    logBanks();
                    System.out.println("Select your bank Id");
                    bankId = scn.nextInt();
                    System.out.println("Choose the user that want to cash-in");
                    logUsersByBankId(bankId - 1);
                    userId = scn.nextInt();
                    System.out.println("Hom much money you want to cash-in?");
                    cash = scn.nextInt();
                    cashIn(cash, bankId - 1, userId - 1);
                    break;
                case 4:
                    logBanks();
                    System.out.println("Select your bank Id");
                    bankId = scn.nextInt();
                    System.out.println("Choose the user that want to cash-out");
                    logUsersByBankId(bankId - 1);
                    userId = scn.nextInt();
                    System.out.println("Hom much money you want to cash-out?");
                    cash = scn.nextInt();
                    cashOut(cash, bankId - 1, userId - 1);
                    break;
                case 5:
                    logBanks();
                    System.out.println("Select your bank Id");
                    bankId = scn.nextInt();
                    System.out.println("Choose the user that want to transfer money");
                    logUsersByBankId(bankId - 1);
                    int userId1 = scn.nextInt();
                    System.out.println("Choose the user that want will get the money");
                    logUsersByBankId(bankId - 1);
                    int userId2 = scn.nextInt();
                    System.out.println("Hom much money you want to transfer?");
                    cash = scn.nextInt();
                    cashOut(cash, bankId - 1, userId1 - 1);
                    cashIn(cash, bankId - 1, userId2 - 1);
                    break;
                case 6:
                    logBanks();
                    System.out.println("Select your bank Id");
                    bankId = scn.nextInt();
                    logUsersByBankId(bankId - 1);
                    break;
                case 7:
                    isFinished = true;
                    System.out.println("Thank you for using our Banking system.");
                    break;
                default:
                    System.out.println("Error while input");
            }
        }

    }

    static void cashIn(int cash, int bankId, int userId) {
        if (banks[bankId] != null) {
            banks[bankId].getUsers()[userId].setBalance(banks[bankId].getUsers()[userId].getBalance() + cash);
        } else {
            System.out.println("The bank with this number does not exist");
        }
    }

    static void cashOut(int cash, int bankId, int userId) {
        if (banks[bankId] != null) {
            banks[bankId].getUsers()[userId].setBalance(banks[bankId].getUsers()[userId].getBalance() - cash);
        } else {
            System.out.println("The bank with this number does not exist");
        }
    }

    private static void removeUser(int userId, int bankId) {
        if (banks[bankId].getUsers()[userId - 1] != null) {
            banks[bankId].getUsers()[userId - 1] = null;
            System.out.println("The user was removed");
        } else {
            System.out.println("Something went wrong, please try again!");
        }
    }

    static void logUsersByBankId(int bankId) {
        for(int i = 0; i < 10; ++i) {
            if (banks[bankId].getUsers()[i] != null) {
                System.out.println(i + 1 + ". " + banks[bankId].getUsers()[i]);
            }
        }

    }

    private static void addNewUser(User user, int bankId) {
        Bank bank = getBankById(bankId);
        User[] users = bank.getUsers();

        for(int i = 0; i < users.length; ++i) {
            if (users[i] == null) {
                user.setId(i + 1);
                user.setAccountNumber(i + 1);
                users[i] = user;
                return;
            }
        }

    }

    private static Bank getBankById(int id) {
        for(int i = 0; i < banks.length; ++i) {
            if (banks[i].getId() == id) {
                return banks[i];
            }
        }

        System.out.println("incorrect ID");
        return null;
    }

    private static void logMenu() {
        System.out.println("Type 1 if you want to add User");
        System.out.println("Type 2 if you want to remove User");
        System.out.println("Type 3 if you want to cash-in");
        System.out.println("Type 4 if you want to cash-out");
        System.out.println("Type 5 if you want to transfer money");
        System.out.println("Type 6 if you want to log user's by the Bank ID");
        System.out.println("Type 7 if you want to exit");
    }

    private static void logBanks() {
        System.out.println("Please, type ID of the bank");

        for(int i = 0; i < banks.length; ++i) {
            System.out.println(i + 1 + ". " + banks[i].getName());
        }

    }
}