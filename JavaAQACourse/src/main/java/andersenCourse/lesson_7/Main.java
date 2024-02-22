package andersenCourse.lesson_7;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = {
                {250, 200, 123},
                {300, 340, 500}
        };
        File file = new File("---------");
        AppData appData = new AppData(header, data, file);
        appData.save();
        appData.load();
    }
}

