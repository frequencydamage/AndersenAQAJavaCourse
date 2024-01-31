package AndersenCourse.lesson_2;

public class Task_5 {
    //Task 5 - Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void main(String[] args) {
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                myArray[i] = 0;
            }
            else {
                myArray[i] = 1;
            }
        }
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }
}
