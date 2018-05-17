import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListExTest
{
    List<String> InitializeTestList()
    {
        return Arrays.asList("MIKE","FIFI","KONDZIO","SIKOR");
    }

    @Test
    void toUpperWithIterator()
    {
        ListEx listEx = new ListEx();
        listEx.ToUpperWithIterator();
        assertIterableEquals(listEx._list,InitializeTestList());
    }

    @Test
    void toUpperWithLoop()
    {
        ListEx listEx = new ListEx();
        listEx.ToUpperWithLoop();
        assertIterableEquals(listEx._list,InitializeTestList());
    }

    @Test
    void toUpperWithReplaceAll()
    {
        ListEx listEx = new ListEx();
        listEx.ToUpperWithReplaceAll();
        assertIterableEquals(listEx._list,InitializeTestList());
    }
}