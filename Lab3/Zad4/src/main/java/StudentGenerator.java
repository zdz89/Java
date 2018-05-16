import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentGenerator
{
    public static List<Student> GetStudents() throws ParseException
    {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Gianluigi","Buffon",new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2017"),198));
        students.add(new Student("Konrad","Bralczyk",new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2017"),190));
        students.add(new Student("Kornel","Zdzichowski",new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2017"),184));
        students.add(new Student("Michał","Sikora",new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2004"),176));
        students.add(new Student("Michał","Szczepański",new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2004"),175));
        students.add(new Student("Filip","Czapla",new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2004"),191));

        return students;
    }
}
