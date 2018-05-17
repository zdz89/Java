public class Main
{
    public static void main(String[] args)
    {
        HashTableEx hashTableEx = new HashTableEx();
        hashTableEx.IncreaseValueWithContainsKey("string1",1);
        hashTableEx.IncreaseValueWithGet("string2",1);
        hashTableEx.IncreaseValueWithGetOrDefault("string3",1);
        hashTableEx.IncreaseValueWithPutIfAbsent("string4",1);
    }
}