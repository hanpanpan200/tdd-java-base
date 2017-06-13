import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
        Counter counter = new Counter(words);
        //When
        Map<String, Integer> result = counter.count();
        //Then
        assertThat(result.get("the"),is(3));
        assertThat(result.get("day"),is(1));
        assertThat(result.get("is"),is(1));
    }
}