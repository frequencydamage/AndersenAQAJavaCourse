package andersenCourse.lesson_7;

import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;
    private File file;

    public AppData(String[] header, int[][] data, File file) {
        this.header = header;
        this.data = data;
        this.file = file;
    }

    public void save() {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < header.length; i++) {
                if (i != header.length - 1) {
                    printWriter.print(header[i] + ";");
                } else {
                    printWriter.print(header[i]);
                }
            }
            printWriter.println();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (j != data[i].length - 1) {
                        printWriter.print(data[i][j] + ";");
                    } else {
                        printWriter.print(data[i][j]);
                    }
                }
                printWriter.println();
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void load() {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(file))) {
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
