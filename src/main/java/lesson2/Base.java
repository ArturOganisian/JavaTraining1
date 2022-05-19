package lesson2;

import java.sql.SQLOutput;

public class Base {
    public static void main(String[] args) {

        char countryCode = 'a';
        String travelingCountry;
        int myBudget = 789;
        int sumNeeded;
        boolean isNegative = false;


        if(myBudget < 0){
            isNegative = true;
            System.out.println("Haha, negative budget. Are you joking?!?");
        }
        if(countryCode == 'r' && myBudget >= 2000){
            System.out.println("You can travel to Russia with the budget you have. ");
        }
        else if(countryCode == 'u' && myBudget >= 3500){
            System.out.println("You can travel to USA with the budget you have. ");
        }
        else if(countryCode == 'a' && myBudget >= 1500){
            System.out.println("You can travel to Armenia with the budget you have. ");
        }
        else if(countryCode == 'e' && myBudget >= 1000){
            System.out.println("You can travel to Egypt with the budget you have. ");
        }
        else{
            if(isNegative == false) {
                System.out.println("Not enough budget for the traveling.");
                if(countryCode == 'r') {
                    sumNeeded = 2000 - myBudget;
                    System.out.println("Don't give up. Collect at least " + sumNeeded + "$ and you can travel to Russia.");
                }
                else if(countryCode == 'u'){
                    sumNeeded = 3500 - myBudget;
                    System.out.println("Don't give up. Collect at least " + sumNeeded + "$ and you can travel to USA.");
                }
                else if(countryCode == 'a'){
                    sumNeeded = 1500 - myBudget;
                    System.out.println("Don't give up. Collect at least " + sumNeeded + "$ and you can travel to Armenia.");
                }
                else if(countryCode == 'e'){
                    sumNeeded = 1000 - myBudget;
                    System.out.println("Don't give up. Collect at least " + sumNeeded + "$ and you can travel to Egypt.");
                }
            }
        }


    }
}
