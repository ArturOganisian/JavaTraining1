package Lesson4;

public class Homework4 {
    public static void main(String[] args) {
        int [][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum of odd Elements in matrix is: " + matrixOddElementSum(myArray));

        String word = "This Is Awesome!";
        System.out.println("Display Word In UpperCase: " + upperCase(word));
    }

    public static int matrixOddElementSum (int[][] array){
        int sumOfOddElement = 0;
        for(int i = 0;i< array.length;i++){
            for(int j = 0;j< array[i].length;j++){
                if(array[i][j]%2!=0){
                   sumOfOddElement = sumOfOddElement + array[i][j];
                }
            }
        }
        return sumOfOddElement;
    }

    public static String upperCase (String word){
        char[] wordArray = new char[word.length()];
        for(int i = 0;i < word.length();i++){
            wordArray[i] = word.charAt(i);
        }
        for(int i = 0;i < wordArray.length;i++)
            if (wordArray[i] >= 'a' && wordArray[i] <= 'z') {
                wordArray[i] = (char) (wordArray[i] - ('a' - 'A'));
            }
        String string = new String(wordArray);
        return string;
    }
}
