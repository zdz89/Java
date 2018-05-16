import java.text.ParseException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws ParseException
    {
        List<Student> s = StudentGenerator.GetStudents();
        Collections.sort(s, new MyComparator());
        List<Student> ss = StudentGenerator.GetStudents();
        Collections.sort(ss, new GuavaComparator());
    }
}