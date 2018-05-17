import java.util.*;

public class ListEx
{
    public List<String> _list;

    public void InitializeList()
    {
        _list = new ArrayList<>();
        _list.add("Mike");
        _list.add("Fifi");
        _list.add("Kondzio");
        _list.add("Sikor");
    }

    public void ToUpperWithIterator()
    {
        InitializeList();
        ListIterator it = _list.listIterator();

        while(it.hasNext())
        {
            String str = (String)it.next();
            it.set(str.toUpperCase());
        }
    }

    public void ToUpperWithLoop()
    {
        InitializeList();

        for (int i = 0; i < _list.size(); i++)
        {
            _list.set(i,_list.get(i).toUpperCase());
        }
    }

    public void ToUpperWithReplaceAll()
    {
        InitializeList();
        _list.replaceAll(s -> s.toUpperCase());
    }
}
