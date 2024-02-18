package AndersenCourse.lesson_8.arrayAndWords;

import java.util.*;

public class ArrayWordsManipulator {
    public static List<String> getUniqueWords(String[] array) {
        List<String> uniqueWords = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String uniqWord = array[i];
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[j].equals(uniqWord)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueWords.add(uniqWord);
            }
        }
        return uniqueWords;
    }

    public static void getWordsCount(String[] array) {
        Map<String, Integer> wordsCounted = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            String word = array[i];
            for (int j = 0; j < array.length; j++) {
                if (i != j && word.equals(array[j])) {
                    count++;
                }
            }
            wordsCounted.put(word, count);
        }
        for (Map.Entry<String, Integer> entry : wordsCounted.entrySet()) {
            System.out.println("Word: " + entry.getKey() + " Appears: " + entry.getValue() + " time(s)");
        }
    }
}
