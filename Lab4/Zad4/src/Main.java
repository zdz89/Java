import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Long> arrayList = new ArrayList<>();
        LinkedList<Long> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            long number = new Random().nextLong();
            arrayList.add(number);
            linkedList.add(number);
        }

        long startTime = System.nanoTime();
        swap(arrayList,0,7000);
        long arrayListTime =  System.nanoTime() - startTime;

        startTime = System.nanoTime();
        swap(linkedList,0,7000);
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("Arraylist: " + arrayListTime);
        System.out.println("LinkedList: " + linkedListTime);

        swap2(arrayList,0,5000);
        swap2(linkedList,0,5000);

    }

    public static <T> void swap(List<T> list, int i, int j)
    {
        list.set(i,list.set(j,list.get(i)));
    }

    public static <T> void swap2(List<T> list, int i, int j)
    {
        if(list instanceof RandomAccess)
        {
            list.set(i,list.set(j,list.get(i)));
        }
        else
        {
            throw new IllegalArgumentException("Lista nie obsługuje swobodnego dostępu");
        }
    }
}