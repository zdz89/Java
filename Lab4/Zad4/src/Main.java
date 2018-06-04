import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Long> list = new ArrayList<>();
        list.add((long)1211231233);
        list.add((long)12312343);
        list.add((long)12123);

        swap(list,0,2);
    }

    public static <T> void swap(List<T> list, int i, int j)
    {
        list.set(i,list.set(j,list.get(i)));
    }
}