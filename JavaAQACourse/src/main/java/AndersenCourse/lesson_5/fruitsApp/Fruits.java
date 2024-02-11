package AndersenCourse.lesson_5.fruitsApp;

public abstract class Fruits {
    private float fruitWeight;

    public Fruits(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public float getFruitWeight() {
        return fruitWeight;
    }
}
