package AndersenCourse.lesson_6;

public class MyArrayDataException extends Exception {
    private int arrayLine;
    private int arrayIndex;

    public MyArrayDataException(int arrayLine, int arrayIndex) {
        this.arrayLine = arrayLine;
        this.arrayIndex = arrayIndex;
    }

    @Override
    public String getMessage() {
        return "Can not parse element index: [" + arrayIndex + "] in line: [" + arrayLine + "]";
    }
}

