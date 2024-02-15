package AndersenCourse.lesson_6;

public class Main {
    //Task - 1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
    //При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    //Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    //должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    //3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
    //и MyArrayDataException и вывести результат расчета.
    public static void main(String[] args) {
        String[][] myArray = {
                {"-5", "28", "3", "45"},
                {"-8", "3", "5", "4"},
                {"2", "15", "44", "3"},
                {"-156", "54", "3", "22"}
        };

        try {
            System.out.println("Sum of array elements is: " + ArrayManipulator.arrayElementSum(myArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
