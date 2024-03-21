package AndersenCourse.lesson_2;

public class Task_9 {
    //Task 9* - Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void main(String[] args) {
        int[] myArray = arrInit(5, 3);
        for (int i : myArray) {
            System.out.print(i + " ");
        }

        System.out.println("\n======================");

        int[] someArray = {1, 2, 3, 4, 5};
        int n = 1; //put negative value to shift the array backward; put positive value to shift the array forward;
        someArray = arrShift(someArray, n);
        for (int value : someArray)
            System.out.print(value + " ");
    }

    public static int[] arrInit(int len, int initialValue) {
        int[] myArray = new int[len];
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = initialValue;
        return myArray;
    }

    //Task 9*** - Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    public static int[] arrShift(int[] myArray, int n){
        int saveValue;
        if (n % myArray.length == 0) {
            return myArray;
        }
        else {
            n %= myArray.length;
        }
        if (n > 0){
            for (int i = 0; i < n ; i++) {
                for (int j = myArray.length - 1; j > 0; j--) {
                    saveValue = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = saveValue;
                }
            }
        }
        else {
            n = n * -1;
            for (int i = 0; i < n ; i++) {
                for (int j = 1; j < myArray.length; j++) {
                    saveValue = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = saveValue;
                }
            }
        }
        return myArray;
    }
}
