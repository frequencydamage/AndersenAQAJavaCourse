package AndersenCourse.lesson_4.animalApp;

public class Cat extends Animal {
    private static int catCounter = 0;
    private boolean isHungry = true;

    public Cat(String animalName) {
        super(animalName);
        catCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance > 0) {
            System.out.println(getAnimalName() + " has ran: " + distance + " meters!");
        } else {
            System.out.println("Cats do not run that far!");
        }
    }

    public void getCatInfo() {
        System.out.println("========================" + "\nCat name: " + getAnimalName());
        if (!isHungry) {
            System.out.println("Hungriness: Not hungry!" + "\n========================");
        } else {
            System.out.println("Hungriness: Hungry!" + "\n========================");
        }
    }

    public void eat(Plate plate, int amount) {
        if (plate.getFoodAmount() >= amount) {
            plate.decreaseFoodAmount(amount);
            isHungry = false;
        } else {
            System.out.println("There is not enough food!");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats do not swim!");
    }

    public static void getCount() {
        System.out.println("Number of cats is: " + catCounter);
    }
}
