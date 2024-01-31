package AndersenCourse.lesson_2;

public class Task_1 {
    //Task 1 - Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static void main(String[] args) {
        System.out.println(isPositiveSum(-28, 40));
    }

    public static boolean isPositiveSum(int value_1, int value_2){
        return value_1 + value_2 > 10 && value_1 + value_2 <= 20;
    }
}
