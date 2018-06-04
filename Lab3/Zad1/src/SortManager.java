import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;

public class SortManager
{
    public void sortStrings(Collator collator, String[] names)
    {
        String tmp;

        for (int i = 0; i < names.length; i++)
        {
            for (int j = i + 1; j < names.length; j++)
            {
                if (collator.compare(names[i], names[j]) > 0)
                {
                    tmp = names[i];
                    names[i] = names[j];
                    names[j] = tmp;
                }
            }
        }
    }

    public long sortStringsPerformance(Collator collator)
    {
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            sortStrings(collator,getNames());
        }

        return System.nanoTime() - startTime;
    };

    public void fastSortStrings(Collator collator, String[] names)
    {
        Arrays.sort(names, new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2) {
                return collator.compare(s1, s2);
            }
        });
    }

    public long fastSortStringsPerformance(Collator collator)
    {
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            fastSortStrings(collator,getNames());
        }

        return System.nanoTime() - startTime;
    };

    public void fastSortStrings2(Collator collator, String[] names)
    {
        Arrays.sort(names, (String s1, String s2) -> collator.compare(s1, s2));
    }

    public long fastSortStrings2Performance(Collator collator)
    {
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++)
        {
            fastSortStrings2(collator,getNames());
        }

        return System.nanoTime() - startTime;
    };

    public String[] getNames()
    {
        return new String[] {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka", "Zyta", "Órszula"};
    }
}