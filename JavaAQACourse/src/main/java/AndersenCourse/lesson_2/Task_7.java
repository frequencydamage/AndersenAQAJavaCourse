package AndersenCourse.lesson_2;

public class Task_7 {
    //Task 7 - Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void main(String[] args) {
        int[] myArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < myArray.length ; i++) {
            if (myArray[i] < 6) {
                myArray[i] = myArray[i] * 2;
            }
            System.out.println(myArray[i]);
        }
    }
}
