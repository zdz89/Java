import java.util.ArrayList;
import java.util.List;
import com.sun.istack.internal.NotNull;

public class StringSplitter
{
    static Iterable<String> Split(@NotNull String s, int length)
    {
        if(length <= 0 || s == null)
            throw new IllegalArgumentException("Błąd parametrów wejściowych");

        List<String> strings = new ArrayList<String>();
        int index = 0;
        while (index < s.length()) {
            strings.add(s.substring(index, Math.min(index + length,s.length())));
            index += length;
        }
        return strings;
    }
}
