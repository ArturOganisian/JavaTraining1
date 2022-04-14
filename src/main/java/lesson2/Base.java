package lesson2;

import java.sql.SQLOutput;

public class Base {
    public static void main(String[] args) {



        boolean isUSA = true;
        int userAge = 15;



        int minimalAge = isUSA?21:18;

        if(isUSA){
            minimalAge = 21;
        }
        else{
            minimalAge = 18;
        }


        if (userAge > 100 || userAge < 0){
            System.out.println("invalid age");
        }
        else {
            if (userAge < 18) {
                System.out.println("Hmm... your age is under 18.");
            } else if (userAge == 18) {
                System.out.println("you can buy only beer");
            } else {
                System.out.println("Amazing");
            }
        }
    }
}
