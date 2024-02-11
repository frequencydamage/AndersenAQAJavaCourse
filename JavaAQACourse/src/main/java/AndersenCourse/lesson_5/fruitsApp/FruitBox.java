package AndersenCourse.lesson_5.fruitsApp;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruits> {
    private float emptyBoxWeight = 0f;
    private List<T> fruitBox = new ArrayList<>();

    public void addFruits(T fruit, int amount) {
        if (amount > 0) {
            for (int i = 0; i < amount; i++) {
                fruitBox.add(fruit);
            }
            System.out.println("You've succesfully added " + amount + " fruits!");
        } else {
            System.out.println("You can not add nothing!");
        }
    }

    public float getWeight() {
        if (fruitBox.size() != 0) {
            return fruitBox.size() * fruitBox.get(0).getFruitWeight();
        } else {
            return emptyBoxWeight;
        }
    }

    public void compareWeights(FruitBox<?> box) {
        if (this.getWeight() > box.getWeight()) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public void moveFruits(FruitBox<T> newBox) {
        if (newBox.fruitBox.isEmpty()) {
            newBox.fruitBox.addAll(fruitBox);
            fruitBox.clear();
            System.out.println("You've successfully moved fruits to the other box!");
        } else if (!newBox.fruitBox.isEmpty()) {
            System.out.println("The box you are trying to move the fruits into is not empty!");
        }
    }
}
