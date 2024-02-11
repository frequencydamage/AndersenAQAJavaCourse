package AndersenCourse.lesson_5.arraySwap;

public class ArraySwapClass {
    public static void main(String[] args) {
        int[] myArray = {5, 15, 4, -32, 146, -9, 55, 66};

        swap(myArray,2, 6);
        for (Integer i : myArray){
            System.out.println(i);
        }
    }

    public static void swap(int[] array, int firstIndex, int secondIndex){
        int saveValue;
        if (firstIndex > 0 && firstIndex < array.length && secondIndex > 0 && secondIndex < array.length){
            saveValue = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = saveValue;
        } else {
            System.out.println("Can't solve the problem!");
        }
    }
}
