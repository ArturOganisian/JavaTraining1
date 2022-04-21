package Lesson3;

public class Base31 {
        public static void main(String[] args) {

           int num = 10;
           System.out.println("Entered number: " + num);
           int size = num;
           if(num<0){
               size = -size;
           }

           int[] oddArray = new int[size/2];
           int[] evenArray = new int[size/2 +1];

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
               for (int i = 0; i <= num; ++i) {
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


        }
}
