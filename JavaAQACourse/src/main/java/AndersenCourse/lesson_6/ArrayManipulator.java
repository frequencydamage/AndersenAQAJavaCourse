package AndersenCourse.lesson_6;

import java.lang.reflect.Array;

public class ArrayManipulator {
    static int arrayElementSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        for (String[] strings : array) {
            if (array.length != 4 || strings.length != 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
