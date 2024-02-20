package AndersenCourse.lesson_5.fruitsApp;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruits> {
    private List<T> fruitBox = new ArrayList<>();

    public void addFruits(T fruit, int amount) {
        if (fruitBox.isEmpty() || (fruitBox.getFirst().getClass().isInstance(fruit))) {
            if (amount > 0) {
                for (int i = 0; i < amount; i++) {
                    fruitBox.add(fruit);
                }
                System.out.println("You've successfully added " + amount + " fruits!");
            } else {
                System.out.println("You can not add nothing!");
            }
        } else {
            System.out.println("You can not add different type of fruits to this box!");
        }
    }


    public float getWeight() {
        if (!fruitBox.isEmpty()) {
            return fruitBox.size() * fruitBox.getFirst().getFruitWeight();
        } else {
            return 0f;
        }
    }

    public void compareWeights(FruitBox<?> box) {
        if (this.getWeight() != box.getWeight()) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public void moveFruits(FruitBox<T> newBox) {
        if (newBox.fruitBox.isEmpty()) {
            newBox.fruitBox.addAll(fruitBox);
            fruitBox.clear();
            System.out.println("You've successfully moved fruits to another box!");
        } else if (fruitBox.getFirst().getClass() != newBox.fruitBox.getFirst().getClass()) {
            System.out.println("You can not move fruits to a box that contains different kinds of fruits!");
        } else {
            System.out.println("This box is not empty!");
        }
    }
}
