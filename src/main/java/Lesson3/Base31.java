package Lesson3;

public class Base31 {
        public static void main(String[] args) {

            // Task 1: showing off the odd and even numbers for positive and negative cases

           System.out.println("Task1:");
           int num = -17;
           System.out.println("Entered number: " + num);
           int size = num;
           if(num<0){
               size = -size;
           }

           int[] oddArray = new int[size/2 + 1];
           int[] evenArray = new int[size/2 + 1];

           int oddArrayIndex = 0;
           int evenArrayIndex = 0;

           if(num<0){
               for (int i = -num; i > 0; i--) {
                   if (i % 2 == 0) {
                       evenArray[evenArrayIndex] = -i;
                       evenArrayIndex++;
                   }
                   else{
                       oddArray[oddArrayIndex] = -i;
                       oddArrayIndex++;
                   }
               }
           }
           else {
               for (int i = 0; i <= num; i++) {
                   if (i % 2 == 0) {
                       evenArray[evenArrayIndex] = i;
                       evenArrayIndex++;
                   }
                   else{
                       oddArray[oddArrayIndex] = i;
                       oddArrayIndex++;
                   }
               }
           }
           System.out.print("Even numbers Array: ");
           for(int i = 0;i<evenArray.length;i++){
               System.out.print(evenArray[i] + " ");
           }
           System.out.println();
           System.out.print("Odd numbers Array: ");
           for(int i = 0;i<oddArray.length;i++){
               System.out.print(oddArray[i] + " ");
           }
           if (num == 0){
               System.out.print("Array is empty because there is no any odd number");
           }
            System.out.println();
            // Task 2: declaring array and finding max value

            System.out.println();
            System.out.println("Task2");

            int[] someArray = {-25, -10, - 8,  5, 39, 14, 0, -1, -289, 1000, 103, -7, 1000, -10, 1};
            System.out.print("Entered the fallowing Array: ");
            for(int i = 0;i<someArray.length;i++){
                System.out.print(someArray[i] + " ");
            }
            int max = someArray[0];
            System.out.println();
            for (int i = 0;i<someArray.length - 1 ;i++) {
                if (someArray[i] > max) {
                    max = someArray[i];
                }
            }
            System.out.println("The Max number in this array is: " + max);
        }
}
