package AndersenCourse.lesson_4.animalApp;

public class Dog extends Animal {
    private static int dogCounter = 0;

    public Dog(String animalName) {
        super(animalName);
        dogCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500 && distance > 0) {
            System.out.println(getAnimalName() + " has ran: " + distance + " meters!");
        } else {
            System.out.println("Dogs do not run that far!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance > 0) {
            System.out.println(getAnimalName() + " swam: " + distance + " meters!");
        } else {
            System.out.println("Dogs do not swim that far!");
        }
    }

    public static void getCount() {
        System.out.println("Number of dogs is: " + dogCounter);
    }
}
