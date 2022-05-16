package Homework8;

public class Crocodile extends Reptile {
    private String name;
    public Crocodile(String animalType,String mealType, int age,int movementSpeed,boolean isPredator, int attackSpeed,String name) {
        super(animalType, mealType, age, movementSpeed, isPredator, attackSpeed);
        this.setName(name);
    }
    public Crocodile(Reptile animal, String name){
        super(animal.getAnimalType(), animal.getMealType(),animal.getAge(), animal.getMovementSpeed(), animal.isPredator(), animal.getAttackSpeed());
        this.setName(name);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.getName()+ " Crocodile is " +this.getAge()+ " year old";
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