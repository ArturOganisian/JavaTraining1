package Homework8;

public class Sparrow extends Bird{
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Sparrow(String animalType,String mealType, int age,int movementSpeed, boolean isPredator,  boolean canFly, String name) {
        super(animalType, mealType, age, movementSpeed, isPredator, canFly);
        this.setName(name);
    }
    public Sparrow(Bird bird, String name){
        super(bird.getAnimalType(),bird.getMealType(),bird.getAge(),bird.getMovementSpeed(),bird.isPredator(),bird.canFly());
        this.setName(name);

    }

    @Override
    public String toString() {
        return this.getName()+ " Sparrow is " +this.getAge()+ " years old";
    }
    @Override
    public void feed() {
        System.out.println(this.getName()+" eats "+this.getMealType());
    }

    @Override
    public void move() {
        System.out.println(this.getName()+" move's with "+this.getMovementSpeed()+" speed");
    }
}
