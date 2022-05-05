package Lesson6;
import java.util.Scanner;

public class Homework6 {
    static int count=0;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        User[] array = new User[2];
        boolean exitAction = false;
        System.out.println("Press 1 to add User");
        System.out.println("Press 2 to remove Use");
        System.out.println("Press 3 to see all users");
        System.out.println("Press 4 to close the app");
        while(exitAction == false){
            System.out.print("Input button");
            int inputButton = input.nextInt();
            switch (inputButton){
                case 1:
                    System.out.println("Enter User's Name: ");
                    String name=input.next();
                    System.out.println("Enter User's  Surname: ");
                    String surName=input.next();
                    System.out.println("Enter User's Age: ");
                    int age=input.nextInt();
                    addUser(array,name,surName,age);
                    break;
                case 2:
                    if(!isEmpty(array)){
                        break;
                    }
                    showUsers(array);
                    System.out.println();
                    System.out.print("Select the index of a person that you want to remove: ");
                    int removedIndex=input.nextInt();
                    removeUser(array,removedIndex);
                    break;
                case 3:
                    if(!isEmpty(array)){
                        break;
                    }
                    nameSorting(array);
                    showUsers(array);
                    break;
                case 4:
                    exitAction = true;
                    break;
            }
        }
    }
    public static  void addUser(User[] array, String name,String surname, int age){
        User person = new User(name,surname,age);
        for(int i=0;i<array.length;i++){
            if(array[i] == null){
                array[i]=person;
                arrResize(array);
            }
        }
        count++;
    }
    public static void showUsers(User[] array){
        int index=1;
        for(int i=0;i<count;i++){
            System.out.println(array[i].getName()+" index is: "+index);
            index++;
        }
    }
    public static void removeUser(User[] array,int index){
        index--;
        if(index>=array.length){
            System.out.println("Index Error");
            return;
        }
        else {
            if(index==array.length-1){
                array[array.length-1]=null;
            }
            else {
                for(int i=index;i<array.length-1;i++){
                    array[i]=array[i+1];
                }
            }
            count--;
        }
    }
    public  static User[] nameSorting(User[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1;j < array.length; j++){
                if(array[i].getName().compareTo(array[j].getName())>0){
                    User temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
             }
          }
     }
     return array;
    }
    public  static User[] arrResize(User[] array){
        User[] copy = new User[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
            array = copy;
        }
        return array;
    }
    public static boolean isEmpty(User[]array){
        if(array[0] == null){
            return  false;
        }
        return  true;
    }
}