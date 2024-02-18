package AndersenCourse.lesson_8.arrayAndWords;

import java.util.*;

public class ArrayWordsManipulator {
    public static List<String> getUniqueWords(String[] array) {
        Map<String, Integer> uniqueWords = new HashMap<>();
        for (String word : array) {
            uniqueWords.put(word, uniqueWords.getOrDefault(word, 0) + 1);
        }
        List<String> uniqueWordsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : uniqueWords.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWordsList.add(entry.getKey());
            }
        }
        return uniqueWordsList;
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
