import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by pphan on 14/06/2017.
 */
public class CounterHelper {

    public String[] getArray(String words) {
        return words.split("\\s+");
    }

    public String getStringFromFile() throws FileNotFoundException {
        return new Scanner(new File("words.txt")).useDelimiter("\\Z").next();
    }
}
