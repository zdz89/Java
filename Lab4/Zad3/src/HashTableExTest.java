import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HashTableExTest
{
    @Test
    void increaseValueWithContainsKey()
    {
        String test = "string1";
        HashTableEx hashTableEx = new HashTableEx();
        hashTableEx.IncreaseValueWithContainsKey(test,2);
        int value = hashTableEx.hashTable.get(test);

        assertEquals(value,3);
    }

    @Test
    void increaseValueWithGet()
    {
        String test = "string2";
        HashTableEx hashTableEx = new HashTableEx();
        hashTableEx.IncreaseValueWithGet(test,2);
        int value = hashTableEx.hashTable.get(test);

        assertEquals(value,4);
    }

    @Test
    void increaseValueWithGetOrDefault()
    {
        String test = "string3";
        HashTableEx hashTableEx = new HashTableEx();
        hashTableEx.IncreaseValueWithGetOrDefault(test,2);
        int value = hashTableEx.hashTable.get(test);

        assertEquals(value,5);
    }

    @Test
    void increaseValueWithPutIfAbsent()
    {
        String test = "string4";
        HashTableEx hashTableEx = new HashTableEx();
        hashTableEx.IncreaseValueWithPutIfAbsent(test,2);
        int value = hashTableEx.hashTable.get(test);

        assertEquals(value,2);
    }
}