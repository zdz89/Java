import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class GuavaComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        return ComparisonChain.start()
                .compare(o1.GetDateOfBirth().getYear(), o2.GetDateOfBirth().getYear())
                .compare(o1.GetSurname().substring(0,1),o2.GetSurname().substring(0,1))
                .compare(o2.GetHeight(),o1.GetHeight())
                .result();
    }
}
