import java.util.Comparator;

public class Cyclist implements Comparable<Cyclist>
{
    String _Surname;
    int _Time;

    public Cyclist(String surname, int time)
    {
        _Surname = surname;
        _Time = time;
    }

    public String getSurname() { return _Surname; }
    public void setSurname(String surname) { _Surname = surname; }

    public int getTime() { return _Time; }
    public void setTime(int time) { _Time = time; }

    @Override
    public int compareTo(Cyclist c) {
        int y= this.getTime() - c.getTime();
        return this.getTime() - c.getTime();
    }
}