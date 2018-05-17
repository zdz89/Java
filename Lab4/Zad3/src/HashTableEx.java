import java.util.HashMap;
import java.util.Hashtable;

public class HashTableEx
{
    HashMap<String,Integer> hashTable;

    public HashTableEx()
    {
        hashTable = new HashMap<>();
        hashTable.put("string1",1);
        hashTable.put("string2",2);
        hashTable.put("string3",3);
        hashTable.put("string4",null);
    }

    public void IncreaseValueWithContainsKey(String s, int i)
    {
        if(hashTable.containsKey(s))
        {
            hashTable.put(s, hashTable.get(s) + i);
        }
    }

    public void IncreaseValueWithGet(String s, int i)
    {
        Integer temp = hashTable.get(s);
        if(temp != null)
        {
            hashTable.put(s,temp + i);
        }
    }

    public void IncreaseValueWithGetOrDefault(String s, int i)
    {
        hashTable.put(s,hashTable.getOrDefault(s,null) + i);
    }

    public void IncreaseValueWithPutIfAbsent(String s, int i)
    {
        Integer h = hashTable.get(s);
        hashTable.putIfAbsent(s,i);
    }
}
