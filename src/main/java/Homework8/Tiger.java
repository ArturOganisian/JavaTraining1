package Homework8;

public class Tiger extends WildAnimal {
    private String name;
    public Tiger(String animalType,String mealType, int age,int movementSpeed,boolean isPredator, int jumpDistance,String name) {
        super(animalType, mealType, age, movementSpeed, isPredator, jumpDistance);
        this.setName(name);
    }
    public Tiger(WildAnimal animal, String name){
        super(animal.getAnimalType(), animal.getMealType(),animal.getAge(), animal.getMovementSpeed(), animal.isPredator(), animal.getJumpDistance());
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
        return this.getName()+ " Tiger is " +this.getAge()+ " year old";
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