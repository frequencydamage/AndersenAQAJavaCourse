package AndersenCourse.lesson_2;

public class Task_3 {
    //Task 3 - Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное,
    // и вернуть false если положительное. Замечание: ноль считаем положительным числом.
    public static void main(String[] args) {
        System.out.println(isNegative(-12));
    }

    public static boolean isNegative(int value){
        return value < 0;
    }
}
