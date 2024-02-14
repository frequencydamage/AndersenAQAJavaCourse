package AndersenCourse.lesson_6;

public class Main {
    //Task - 1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
    // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    // должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    //3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
    // и MyArrayDataException и вывести результат расчета.
    public static void main(String[] args) {
        String[][] myArray = {
                {"-5", "28", "33", "45"},
                {"-8", "3", "5", "4"},
                {"2", "15", "55", "3"},
                {"-156", "54", "*", "22"}
        };

        try {
            System.out.println(arrayElementSum(myArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    static int arrayElementSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
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
