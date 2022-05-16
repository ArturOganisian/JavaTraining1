package Homework8;
import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);

    static String[]TypesOfWildAnimals={"Tiger"};
    static String[]TypesOfBirds={"Sparrow"};
    static String[]TypesOfReptiles={"Crocodile", "Snake"};
    static String[]TypesOfWaterAnimals={"Dolphin","Pinguin"};

    public static Zoo zoo = new Zoo("Cutie");

    public static void main(String[] args) {
        System.out.println("Welcome to the zoo!");

        boolean isFinished = false;

        while (!isFinished) {
            logMenu();
            int choose=input.nextInt();

            switch(choose){
                case 1:
                    animalSelection();
                    break;
                case 2:
                    eatingCommand(zoo);
                    break;
                case 3:
                    movingCommand(zoo);
                    break;
                case 4:
                    showAnimals(zoo.getZoo());
                    break;
                case 5:
                    isFinished = true;
                    System.out.println("Thank you for visiting our zoo!.");
                    break;
                default:
                    System.out.println("Invalid Action. Please try again.");
                    break;
            }

        }

    }
    public static Animal createAnimal(String animalType,String mealType){
        System.out.print("Enter Animal's Age: ");
        int age=input.nextInt();
        System.out.println();

        System.out.print("Enter Animal's Speed :");
        int speed=input.nextInt();
        System.out.println();

        if(animalType.equals("WildAnimal")){
            System.out.println("Enter Animal's jump Distance");
            int jump = input.nextInt();
            return new WildAnimal(animalType,mealType,age,speed,true, jump);
        }
        if(animalType.equals("WaterAnimal")){
            System.out.println("Enter the underwater duration");
            int duration = input.nextInt();
            return new WaterAnimal(animalType,mealType,age,speed,true, duration);
        }
        if(animalType.equals("Bird")){
            System.out.println("Press 1 if Bird can fly and Press 2 if Bird can't fly");
            int press = input.nextInt();
            boolean isFly = true;
            if(press == 1){
                isFly = true;
            }
            if(press == 2){
                isFly = false;
            }
            return new Bird(animalType,mealType,age,speed,false, isFly);
        }
        if(animalType.equals("Reptile")){
            System.out.println("Enter Attack Speed");
            int aspeed = input.nextInt();
            return new Reptile(animalType,mealType,age,speed,true, aspeed);
        }

        return null;
    }
    public static  void animalIndex(String[]species){
        for(int i=0;i<species.length;i++){
            int j=i+1;
            System.out.println("The index of "+ species[i]+" is " +j);
        }
    }
    public static void createAnimal(int index, Animal animal){
        System.out.print("Give a name to the Animal: ");
        String name = input.next();
        System.out.println();

        switch (index){
            case 1:
                if(animal.getAnimalType().equals("WildAnimal")){
                    Tiger tiger=new Tiger((WildAnimal)animal,name);
                    addInZoo(zoo,tiger);
                }
                if(animal.getAnimalType().equals("WaterAnimal")){
                    WaterAnimal dolphin=new Dolphin((WaterAnimal) animal,name);
                    addInZoo(zoo,dolphin);
                }
                if(animal.getAnimalType().equals("Reptile")){
                    Reptile croce = new Crocodile((Reptile) animal,name);
                    addInZoo(zoo,croce);
                }
                if(animal.getAnimalType().equals("Bird")){
                    Bird sparrow = new Sparrow((Bird) animal,name);
                    addInZoo(zoo,sparrow);
                }
                break;

            case 2:
                if(animal.getAnimalType().equals("WaterAnimal")){
                    WaterAnimal pinguin=new Pinguin((WaterAnimal) animal,name);
                    addInZoo(zoo,pinguin);
                }
                if(animal.getAnimalType().equals("Reptile")){
                    Reptile snake = new Snake((Reptile) animal,name);
                    addInZoo(zoo,snake);
                }
                break;
        }

    }
    public static void animalSelection(){
        String animalType;
        String mealType;
        logAnimals();

        int choice=input.nextInt();
        switch (choice){
            case 1:
                animalType="Wild Animal";
                mealType="Meat";
                WildAnimal rootWildAnimal= (WildAnimal) createAnimal(animalType,mealType);
                System.out.println("Select the Wild animal Type");
                animalIndex(TypesOfWildAnimals);
                int specieIndex=input.nextInt();
                createAnimal(specieIndex,rootWildAnimal);
                break;
            case 2:
                animalType="Bird";
                mealType="Cereals";
                Bird rootBird=(Bird) createAnimal(animalType,mealType);
                System.out.println("Select the Bird Type");
                animalIndex(TypesOfBirds);
                specieIndex=input.nextInt();
                createAnimal(specieIndex,rootBird);
                break;
            case 3:
                animalType="Water Animal";
                mealType="Fish";
                WaterAnimal rootWaterAnimal=(WaterAnimal) createAnimal(animalType,mealType);
                System.out.println("Select the Water Animal Type");
                animalIndex(TypesOfWaterAnimals);
                specieIndex=input.nextInt();
                createAnimal(specieIndex,rootWaterAnimal);
                break;
            case 4:
                animalType="Reptile";
                mealType="Meat and Fish";
                Reptile rootReptile=(Reptile) createAnimal(animalType,mealType);
                System.out.println("Select the Reptile Type");
                animalIndex(TypesOfReptiles);
                specieIndex=input.nextInt();
                createAnimal(specieIndex,rootReptile);
                break;
            default:
                System.out.println("Error while input");
                break;
        }
    }
    public static void eatingCommand(Zoo zoo){
        for(int i=0;i<zoo.getZoo().length;i++){
            if(zoo.getZoo()[i]!=null)
                zoo.getZoo()[i].feed();
        }
    }
    public static void movingCommand(Zoo zoo){
        for(int i=0;i<zoo.getZoo().length;i++){
            if(zoo.getZoo()[i]!=null)
                zoo.getZoo()[i].move();
        }
    }
    static void showAnimals(Animal[]animals){
        for(int i=0;i<animals.length;i++){
            if(animals[i]!=null)
                System.out.println(animals[i].toString());
        }

    }

    public static void addInZoo(Zoo zoo,Animal animal){
        for(int i=0;i<zoo.getZoo().length;i++){
            if(zoo.getZoo()[i]!=null){
                System.out.println(zoo.getZoo()[i].toString());
            }
            else{
                zoo.getZoo()[i]=animal;
                System.out.println("Animal added");
                break;
            }
        }
    }

    private static void logMenu() {
        System.out.println("Press 1 to add animal");
        System.out.println("Press 2 to feed animals");
        System.out.println("Press 3 to see animals' speed");
        System.out.println("Press 4 to see animals");
        System.out.println("Press 5 to exit");
    }
    private static void logAnimals() {
        System.out.println("Press 1 for Wild Animals");
        System.out.println("Press 2 for Birds");
        System.out.println("Press 3 for Water Animals");
        System.out.println("Press 4 for Reptile");
    }
}