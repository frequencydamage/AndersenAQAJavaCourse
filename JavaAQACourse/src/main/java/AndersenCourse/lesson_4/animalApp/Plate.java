package AndersenCourse.lesson_4.animalApp;


public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFoodAmount() {
        return food;
    }

    public void decreaseFoodAmount(int amount) {
        food -= amount;
    }

    public void addFood(int food) {
        if (food > 0) {
            this.food += food;
            System.out.println("You have succesfully added " + food + " food to the plate");
        } else {
            System.out.println("You can not add nothing!");
        }
    }

    public void info() {
        System.out.println("The plate" + " has: " + food + " food");
    }
}
