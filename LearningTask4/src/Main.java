class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myDuck = new Duck();  // Create a Duck object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myDuck.animalSound();
        myDog.animalSound();
    }
}