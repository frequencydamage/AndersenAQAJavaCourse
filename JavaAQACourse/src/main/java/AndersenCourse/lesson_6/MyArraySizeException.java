package AndersenCourse.lesson_6;

public class MyArraySizeException extends Exception {
    @Override
    public String getMessage() {
        return "Unappropriate array size!!!";
    }
}
