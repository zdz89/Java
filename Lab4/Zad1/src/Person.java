public class Person
{
    private String Name;
    private String Surname;
    private String Nationality;
    private int Salary;

    public Person(String name, String surname, String nationality, int salary) {
        Name = name;
        Surname = surname;
        Nationality = nationality;
        Salary = salary;
    }

    public String getName() { return Name; }
    public String getSurname()
    {
        return Surname;
    }
    public String getNationality()
    {
        return Nationality;
    }
    public int getSalary()
    {
        return Salary;
    }

    public void setName(String n)
    {
        Name = n;
    }
    public void setSurname(String s)
    {
        Surname = s;
    }
    public void setNationality(String n)
    {
        Nationality = n;
    }
    public void setSalary(int s)
    {
        Salary = s;
    }
}
