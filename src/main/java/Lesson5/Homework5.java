package Lesson5;

public class Homework5 {
    public static void main(String[] args) {
        Human person1 = new Human("Suren","Mnacakanyan",23,"Male");
        Human person2 = new Human("Sergey","Poghosyan",37,"Male");
        Human person3 = new Human("Sergey","Alikyan",28,"Male");
        Human person4 = new Human("Alexandra","Soghomonyan",17,"Female");
        Human person5 = new Human("Sara","Hovhannisyan",32,"Female");
        Human[] humanList = new Human[] {person1,person2,person3,person4,person5};

        humanNameBubbleSort(humanList);
        printPersonParam(humanList);
        System.out.println();

        humanAgeBubbleSort(humanList);
        printPersonParam(humanList);
        System.out.println();
    }
    public static Human[] humanAgeBubbleSort(Human[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length-i; j++){
                if(array[j-1].age>array[j].age){
                    Human temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public  static Human[] humanNameBubbleSort(Human[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1;j < array.length; j++){
                if(array[i].name.compareTo(array[j].name)>0){
                    Human temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    public static void printPersonParam(Human[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i].gender == "Male") {
                System.out.printf(array[i].name + " " + array[i].surname + " is " + array[i].age + " year old and he is a " + array[i].gender);
            }
            else{
                System.out.printf(array[i].name + " " + array[i].surname + " is " + array[i].age + " year old and she is a " + array[i].gender);
            }
            System.out.println();
        }
    }
}
