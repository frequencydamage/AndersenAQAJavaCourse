package AndersenCourse.lesson_4.animalApp;

public abstract class Animal {
    private String animalName;

    private static int animalCounter = 0;

    public Animal(String animalName) {
        this.animalName = animalName;
        animalCounter++;
    }

    public static void getCount() {
        System.out.println("Total number of animals is: " + animalCounter);
    }

    public String getAnimalName() {
        return animalName;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
