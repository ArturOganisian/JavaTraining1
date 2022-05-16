package Homework8;

public class Reptile extends Animal{
    private int attackSpeed;

    public int getAttackSpeed() {
        return attackSpeed;
    }
    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Reptile(String animalType, String mealType, int age, int movementSpeed, boolean isPredator, int attackSpeed) {
        super(animalType, mealType, age, movementSpeed, isPredator);
        this.attackSpeed = getAttackSpeed();
    }

    @Override
    public void movingType() {
        System.out.println("Walks Slowly");
    }

}