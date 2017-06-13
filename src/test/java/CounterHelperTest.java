import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pphan on 14/06/2017.
 */
public class CounterHelperTest {
    @Test
    public void should_get_array_from_string() {
        //When
        String words = "the day is  sunny the the   ";
        CounterHelper counterHelper = new CounterHelper();
        //Given
        String[] array = counterHelper.getArray(words);
        //Then
        assertArrayEquals(array, new String[]{"the", "day", "is", "sunny", "the", "the"});
    }
}