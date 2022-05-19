package Lesson3;

import java.sql.SQLOutput;

public class Base3 {
    public static void main(String[] args) {

        char userCountryCode = 'a';
        int userMoney = 20000;

        // 1 - Armenia
        // 2 - Russia
        // 3 - George

        int [] countryCodes = {1,2,3};
        int [] countryBudgets = {10000,20000,30000};

        int [][] countries = new int[3][2];

        int countryBudget = 0;
        if(userCountryCode == countryCodes[0]){
            countryBudget = countryBudgets[0];
        }

        else if(userCountryCode == countryCodes[1]){
            countryBudget = countryBudgets[1];
        }

        else if(userCountryCode == countryCodes[2]){
            countryBudget = countryBudgets[2];
        } else {
            System.out.println("Invalid value");
        }



    }
}
