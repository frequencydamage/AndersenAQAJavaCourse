package AndersenCourse.lesson_2;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1940));
        printStrings("Hello World!!!", 5);
    }

    //Task 4 - Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printStrings(String message, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(message);
        }
    }

    //Task 4* - Написать метод, который определяет, является ли год високосным, и возвращает boolean
    //(високосный - true, не високосный - false).
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year){
        return year % 2 == 0 && (year % 400 == 0 || year % 100 != 0);
    }
}
