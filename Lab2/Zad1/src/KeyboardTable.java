import java.util.HashMap;

public class KeyboardTable {

    public int[] _table = new int[26];

    public KeyboardTable() {
        _table['q' - 97] = 100;
        _table['w' - 97] = 101;
        _table['e' - 97] = 102;
        _table['r' - 97] = 103;
        _table['t' - 97] = 104;
        _table['y' - 97] = 105;
        _table['u' - 97] = 106;
        _table['i' - 97] = 107;
        _table['o' - 97] = 108;
        _table['p' - 97] = 109;
        _table['a' - 97] = 200;
        _table['s' - 97] = 201;
        _table['d' - 97] = 202;
        _table['f' - 97] = 203;
        _table['g' - 97] = 204;
        _table['h' - 97] = 205;
        _table['j' - 97] = 206;
        _table['k' - 97] = 207;
        _table['l' - 97] = 208;
        _table['z' - 97] = 300;
        _table['x' - 97] = 301;
        _table['c' - 97] = 302;
        _table['v' - 97] = 303;
        _table['b' - 97] = 304;
        _table['n' - 97] = 305;
        _table['m' - 97] = 306;
    }

    public boolean CheckAreNeighbours(Character a, Character b)
    {
        int diff = _table[a-97] - _table[b-97];
        return diff == 1 || diff == -1;
    }
}
