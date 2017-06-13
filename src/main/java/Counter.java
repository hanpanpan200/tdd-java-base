import java.util.HashMap;
import java.util.Map;

/**
 * Created by pphan on 13/06/2017.
 */
public class Counter {
    private final String[] words;

    public Counter(String[] words) {
        this.words = words;
    }

    public Map<String, Integer> count() {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word: this.words) {
            int count = wordCounts.containsKey(word) ? wordCounts.get(word) + 1 : 1;
            wordCounts.put(word, count);
        }
        return wordCounts;
    }
}
