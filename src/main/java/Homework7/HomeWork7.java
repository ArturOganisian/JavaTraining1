package Homework7;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Bank acc = new Bank();
        Scanner input = new Scanner(System.in);

        boolean isFinished = false;

        while (!isFinished) {
            System.out.println("Click 1 if you want to add User.");
            System.out.println("Click 2 if you want to remove User.");
            System.out.println("Click 3 if you want to see all users.");
            System.out.println("Click 4 if you want to make transaction.");
            System.out.println("Click 5 if you want to put money in Account.");
            System.out.println("Click 6 if you want to Withdraw money.");
            System.out.println("Click 7 if you want to finish actions.");

            int choose = input.nextInt();

            switch (choose) {
                case 1:
                    User user = new User();
                    System.out.println("Input name:");
                    user.setName(input.next());
                    System.out.println("Input surname:");
                    user.setSurname(input.next());
                    System.out.println("Input age:");
                    user.setAge(input.nextInt());
                    System.out.println("Input current Money");
                    user.setCash(input.nextInt());
                    acc.addAccount(user);
                    System.out.println();
                    break;
                case 2:
                    acc.removeAccount();
                    System.out.println();
                    break;
                case 3:
                    acc.printAccounts();
                    System.out.println();
                    break;
                case 4:
                    acc.transact();
                    System.out.println();
                    break;
                case 5:
                    acc.putMoney();
                    System.out.println();
                    break;
                case 6:
                    acc.withDraw();
                    System.out.println();
                    break;
                case 7:
                    isFinished = true;
                    System.out.println("Thank you for using our Banking system.");
                    break;
                default:
                    System.out.println("Invalid Action ID. Please try again.");
                    break;
            }

        }
    }
}
