public class Levenshtein {

    public double LevQWERTY(String s1, String s2)
    {
        int i, j, m, n;
        double d[][], cost;

        m = s1.length();
        n = s2.length();

        d = new double[m+1][n+1];

        for (i=0; i<=m; i++)
            d[i][0] = i;
        for (j=1; j<=n; j++)
            d[0][j] = j;

        KeyboardTable keyboardTable = new KeyboardTable();

        for (i=1; i<=m; i++)
        {
            for (j=1; j<=n; j++)
            {
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    cost = 0;
                else if (keyboardTable.CheckAreNeighbours(s1.charAt(i-1),s2.charAt(j-1)))
                    cost = 0.5;
                else
                    cost = 1;

                d[i][j] = Math.min(d[i-1][j] + 1,
                        Math.min(d[i][j-1] + 1,
                                d[i-1][j-1] + cost));
            }
        }

        return d[m][n];
    }
}
