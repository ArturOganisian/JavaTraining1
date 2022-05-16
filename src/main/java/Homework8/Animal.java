package Homework8;

    public abstract class Animal {
        private String animalType;
        private String mealType;
        private int movementSpeed;
        private int age;
        private boolean isPredator;
        private String sound;

        public Animal(String animalType,String mealType, int age,int movementSpeed, boolean isPredator){
            this.setAnimalType(animalType);
            this.setMealType(mealType);
            this.setAge(age);
            this.setMovementSpeed(movementSpeed);
        }

        public boolean isPredator() {
            return isPredator;
        }

        public void setPredator(boolean predator) {
            isPredator = predator;
        }

        public int getMovementSpeed() {
            return movementSpeed;
        }
        public void setMovementSpeed(int movementSpeed) {
            this.movementSpeed = movementSpeed;
        }


        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getAnimalType() {
            return animalType;
        }

        public void setAnimalType(String animalType) {
            this.animalType = animalType;
        }

        public String getMealType() {
            return mealType;
        }

        public void setMealType(String meal) {
            this.mealType = mealType;
        }

        public void feed(){
            System.out.println(this.getAnimalType()+" eats " + this.getMealType());
        }
        public void move(){
            System.out.println(this.getAnimalType() + " move's " + this.getMovementSpeed() + " speed");
        }

        public void MovingType() {
        }

        public abstract void movingType();
    }
