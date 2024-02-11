package AndersenCourse.lesson_5.fruitsApp;

public class FruitsApp {
    public static void main(String[] args) {
        FruitBox<Apples> applesFruitBox = new FruitBox<>();
        applesFruitBox.addFruits(new Apples(), 20);
        FruitBox<Oranges> orangesFruitBox = new FruitBox<>();
        orangesFruitBox.addFruits(new Oranges(), 0);
        orangesFruitBox.addFruits(new Oranges(), 25);
        float boxOfApplesWeight = applesFruitBox.getWeight();
        float boxOfOrangesWeight = orangesFruitBox.getWeight();
        System.out.println(boxOfApplesWeight);
        System.out.println(boxOfOrangesWeight);
        orangesFruitBox.compareWeights(applesFruitBox);
        FruitBox<Apples> newApplesFruitBox = new FruitBox<>();
        applesFruitBox.moveFruits(newApplesFruitBox);
        newApplesFruitBox.compareWeights(applesFruitBox);
        boxOfApplesWeight = applesFruitBox.getWeight();
        System.out.println(boxOfApplesWeight);
        applesFruitBox.addFruits(new Apples(), 15);
        applesFruitBox.moveFruits(newApplesFruitBox);
    }
}

