package Homework8;

public class WaterAnimal extends Animal {
    private int underWaterDuration;

    public int getUnderWaterDuration() {
        return underWaterDuration;
    }

    public void setUnderWaterDuration(int underWaterDuration) {
        this.underWaterDuration = underWaterDuration;
    }

    public WaterAnimal(String animalType, String mealType, int age, int movementSpeed, boolean isPredator, int underWaterDuration) {
        super(animalType, mealType, age, movementSpeed, isPredator);
        this.underWaterDuration = getUnderWaterDuration();
    }

    @Override
    public void movingType() {
        System.out.println("Swimming");
    }

}
