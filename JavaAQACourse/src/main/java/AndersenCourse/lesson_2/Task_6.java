package AndersenCourse.lesson_2;

public class Task_6 {
    //Task 6 - Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void main(String[] args) {
        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.println(myArray[i]);
        }
    }
}
