package AndersenCourse.lesson_2;

public class Task_8 {
    //Task 8 - Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void main(String[] args) {
        int[][] myArray = new int[7][7];
        for (int i = 0, j = myArray.length - 1; i < myArray.length; i++, j--) {
            myArray[i][i] = 1;
            myArray[i][j] = 1;
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
