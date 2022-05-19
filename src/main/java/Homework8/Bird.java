package Homework8;

public class Bird extends Animal{
    private boolean canFly;

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }


    public Bird(String animalType,String mealType, int age,int movementSpeed, boolean isPredator,  boolean canFly) {
        super(animalType, mealType, age, movementSpeed, isPredator);
    }

    @Override
    public void movingType() {
        System.out.println("Flying");
    }

}