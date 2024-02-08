package AndersenCourse.lesson_4.animalApp;

import java.util.Random;

public class AnimalsApp {
    public static void main(String[] args) {
        //Animal App Task - 1. Создать классы Собака и Кот с наследованием от класса Животное.
        //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
        // плавание: кот не умеет плавать, собака 10 м.).
        //4. * Добавить подсчет созданных котов, собак и животных.
        //5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
        //● Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
        // (например, в миске 10 еды, а кот пытается покушать 15-20).
        //● Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
        // Если коту удалось покушать (хватило еды), сытость = true.
        //● Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
        // (это сделано для упрощения логики программы).
        //● Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию
        // о сытости котов в консоль.
        //● Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
        Cat[] catsArray = new Cat[3];
        Cat catKuzia = new Cat("Kuzia");
        Cat catMurzik = new Cat("Murzik");
        Dog dogBobik = new Dog("Bobik");
        catKuzia.run(150);
        catKuzia.swim(100);
        catMurzik.run(350);
        dogBobik.run(500);
        dogBobik.swim(8);
        Animal.getCount();
        Cat.getCount();
        Dog.getCount();
        Plate plate = new Plate(50);
        plate.info();
        catKuzia.getCatInfo();
        catKuzia.eat(plate, 50);
        catKuzia.getCatInfo();
        plate.info();
        plate.addFood(100);
        catsArray[0] = catKuzia;
        catsArray[1] = catMurzik;
        catsArray[2] = new Cat("Vasya");
        Random random = new Random();
        for (Cat cat : catsArray) {
            cat.eat(plate, random.nextInt(1, 45));
            cat.getCatInfo();
        }
        plate.info();
    }
}
