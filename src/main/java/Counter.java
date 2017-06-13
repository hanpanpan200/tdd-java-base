import java.util.*;

/**
 * Created by pphan on 13/06/2017.
 */
public class Counter {
    public Map<String, Integer> count(String[] words) {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word: words) {
            int count = wordCounts.containsKey(word) ? wordCounts.get(word) + 1 : 1;
            wordCounts.put(word, count);
        }
        return wordCounts;
    }

    public List<Map.Entry<String, Integer>> sort_word_by_count(Map<String, Integer> wordCounts) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordCounts.entrySet());
        Collections.sort(entries, (o1, o2) -> (o2.getValue() - o1.getValue()));
        return entries;
    }
}
