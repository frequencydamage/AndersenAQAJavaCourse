package AndersenCourse.lesson_5.fruitsApp;

import java.awt.desktop.AppForegroundListener;

public class FruitsApp {
    public static void main(String[] args) {
        FruitBox<Fruits> firstFruitBox = new FruitBox<>();
        FruitBox<Fruits> secondFruitBox = new FruitBox<>();
        FruitBox<Fruits> boxToSwap = new FruitBox<>();
        firstFruitBox.addFruits(new Apples(), 10);
        firstFruitBox.addFruits(new Oranges(), 3);
        secondFruitBox.addFruits(new Oranges(), 10);
        firstFruitBox.compareWeights(secondFruitBox);
        firstFruitBox.moveFruits(secondFruitBox);
        firstFruitBox.moveFruits(boxToSwap);
        firstFruitBox.addFruits(new Oranges(), 15);
    }
}

