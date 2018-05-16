import java.util.Date;

public class Student
{
    private String Name;
    private String Surname;
    private Date DateOfBirth;
    private int Height;

    public Student(String name, String surname, Date dateOfBirth, int height)
    {
        Name = name;
        Surname = surname;
        DateOfBirth = dateOfBirth;
        Height = height;
    }

    public String GetName()
    {
        return Name;
    }

    public String GetSurname()
    {
        return Surname;
    }

    public Date GetDateOfBirth()
    {
        return DateOfBirth;
    }

    public int GetHeight()
    {
        return Height;
    }
}
