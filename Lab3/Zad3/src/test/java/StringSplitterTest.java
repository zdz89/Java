import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.google.common.base.Splitter;

class StringSplitterTest {

    @Test
    void Split()
    {
        String testString = "Ala ma kota";
        int length = 3;

        String testString2 = "Testowy długi string do porównania";
        int length2 = 6;

        Iterable<String> guava = Splitter.fixedLength(length).split(testString);
        Iterable<String> mySplitter = StringSplitter.Split(testString,length);

        Iterable<String> guava2 = Splitter.fixedLength(length2).split(testString2);
        Iterable<String> mySplitter2 = StringSplitter.Split(testString2,length2);

        assertIterableEquals(guava,mySplitter);
        assertIterableEquals(guava2,mySplitter2);
    }
}