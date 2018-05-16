import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest
{
    @Test
    void ComparisonTest() throws ParseException
    {
        List<Student> s = StudentGenerator.GetStudents();
        List<Student> ss = new ArrayList<Student>(s);
        Collections.sort(s, new MyComparator());
        Collections.sort(ss, new GuavaComparator());

        assertIterableEquals(s,ss);
    }
}