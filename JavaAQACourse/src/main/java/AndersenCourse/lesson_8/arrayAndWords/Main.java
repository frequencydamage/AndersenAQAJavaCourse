package AndersenCourse.lesson_8.arrayAndWords;


public class Main {
    public static void main(String[] args) {
        String[] myArray = {"dog", "bob", "parcel", "car", "duck", "plane", "truck", "tank", "car", "cat", "plate", "lamp",
                "parcel", "table", "truck", "words", "bob", "window", "picture", "plane", "bob"};
        System.out.println(ArrayWordsManipulator.getUniqueWords(myArray));
        ArrayWordsManipulator.getWordsCount(myArray);
    }
}
