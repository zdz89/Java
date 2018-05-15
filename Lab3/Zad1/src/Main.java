import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Main {

    public static void main(String[] args)
    {
        SortManager sortManager = new SortManager();
        Collator collator = Collator.getInstance(new Locale("pl", "PL"));

        //sortManager.sortStrings(collator, sortManager.getNames());
        //sortManager.fastSortStrings(collator, sortManager.getNames());
        //sortManager.fastSortStrings2(collator, sortManager.getNames());

        //System.out.println("sortStrings: " + sortManager.sortStringsPerformance(collator));
        System.out.println("fastSortStrings: " + sortManager.fastSortStringsPerformance(collator));

        //System.out.println("sortStrings: " + sortManager.countPerformance(collator, SortManager.Functions.sort));
        //System.out.println("fastSortStrings: " + sortManager.countPerformance(collator, SortManager.Functions.fastSort));
        //System.out.println("fastSortStrings2: " + sortManager.countPerformance(collator, SortManager.Functions.fastSort2));

        //System.out.println(Arrays.toString(names));
    }
}