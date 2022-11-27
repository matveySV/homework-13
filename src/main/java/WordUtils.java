import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WordUtils {
    String getShortestWord(List<String> words) {
        String shortestWord = words.get(0);
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    List<String> countDublicateWords(List<String> words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            int counter = 0;
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    counter++;
                }
            }
            if (counter > 1) {
                result.add(words.get(i));
            }
        }
        return result;
    }
}