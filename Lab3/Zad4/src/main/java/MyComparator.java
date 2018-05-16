import java.util.Comparator;

public class MyComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        int result = Integer.valueOf(o1.GetDateOfBirth().getYear())
                .compareTo(o2.GetDateOfBirth().getYear());

        if( result == 0 )
        {
            result = o1.GetSurname().substring(0,1).compareTo(o2.GetSurname().substring(0,1));

            if( result == 0 )
            {
                result = Integer.valueOf(o2.GetHeight()).compareTo(o1.GetHeight());
            }
        }
        return result;
    }
}
