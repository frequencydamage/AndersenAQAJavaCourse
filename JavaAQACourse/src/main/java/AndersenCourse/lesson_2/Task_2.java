package AndersenCourse.lesson_2;

public class Task_2 {
    //Task 2 - Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void main(String[] args) {
        isPositive(0);
    }

    public static void isPositive(int value){
        if (value >= 0)
            System.out.println("Number is positive!");
        else
            System.out.println("Number is negative!");
    }
}
