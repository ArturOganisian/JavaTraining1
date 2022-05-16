package Homework8;

    public class Dolphin extends WaterAnimal{
        private String name;
        public Dolphin(String animalType, String mealType, int age, int movementSpeed, boolean isPredator, int underWaterDuration,String name) {
            super(animalType, mealType, age, movementSpeed, isPredator, underWaterDuration);
            this.setName(name);
        }
        public Dolphin(WaterAnimal animal, String name){
            super(animal.getAnimalType(), animal.getMealType(),animal.getAge(), animal.getMovementSpeed(), animal.isPredator(), animal.getUnderWaterDuration());
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
            return this.getName()+ " Dolphin is " +this.getAge()+ " year old";
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
