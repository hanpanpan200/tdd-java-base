import org.junit.Test;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

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

    @Test
    public void should_read_string_from_file() throws IOException {
        //When
        CounterHelper counterHelper = new CounterHelper();
        //Given
        String result = counterHelper.getStringFromFile();
        //Then
        assertThat(result,is("Hello world! Hi!"));
    }
}