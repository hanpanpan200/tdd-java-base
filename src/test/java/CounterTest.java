import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pphan on 13/06/2017.
 */
public class CounterTest {

    @Test
    public void should_get_correct_word_count() {
        //Given
        String[] words = {"the", "day", "is", "the", "the"};
        Counter counter = new Counter();
        //When
        Map<String, Integer> result = counter.count(words);
        //Then
        assertThat(result.get("the"),is(3));
        assertThat(result.get("day"),is(1));
        assertThat(result.get("is"),is(1));
    }

    @Test
    public void should_sort_word_counts_in_descending_order() {
        //Given
        Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("day", 1);
        wordCounts.put("the", 3);
        wordCounts.put("is", 2);
        Counter counter = new Counter();
        //When
        List<Map.Entry<String, Integer>> result = counter.sort_word_by_count(wordCounts);
        //Then
        Iterator iterator = result.iterator();
        Integer index = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey( );
            Object value = entry.getValue();
            if (index == 0) {
                assertThat(key, is("the"));
                assertThat(value, is(3));
            }
            if (index == 1) {
                assertThat(key, is("is"));
                assertThat(value, is(2));
            }
            if (index == 2) {
                assertThat(key, is("day"));
                assertThat(value, is(1));
            }
            index++;
        }
    }
}