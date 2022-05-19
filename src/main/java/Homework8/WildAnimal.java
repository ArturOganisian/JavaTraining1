package Homework8;

public class WildAnimal extends Animal{
    private int jumpDistance;

    public int getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(int jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    public WildAnimal(String animalType,String mealType, int age,int movementSpeed,boolean isPredator, int jumpDistance) {
        super(animalType, mealType, age, movementSpeed, isPredator);
        this.setJumpDistance(jumpDistance);
    }

    @Override
    public void movingType(){
        System.out.println("Walking");
    }
}

