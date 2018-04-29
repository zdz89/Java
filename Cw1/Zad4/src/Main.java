public class Main
{
    private static String mainChar = "|";

    public static void main(String[] args)
    {
        PrintRuler(5,6);
    }

    private static void PrintRuler(int units, int nesting)
    {
        double pow = Math.pow(2, nesting-1);

        System.out.print(CreateLine(units,pow,true));
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
        System.out.print(PrintLine(units,pow));
    }

    private static String PrintLine(int units, double pow)
    {
        if(pow==1) return RepeatChar('|', units*pow);

        String temp = CreateLine(units,pow,false);

        temp += System.lineSeparator();
        temp += PrintLine(units*2,pow/2);

        return temp;
    }

    private static String CreateLine(int units, double pow, boolean withDigits) {

        String temp = withDigits ? "0" : mainChar;

        for (int i = 1; i <= units; i++) {
            for (int j = 0; j < pow - 1; j++) {
                temp += " ";
            }

            temp += withDigits ? i : mainChar;
        }

        return  temp;
    }

    private static String RepeatChar(char c, double loop) {
        String temp = new String();

        for (int i = 0; i <= loop; i++) {
            temp += c;
        }

        return temp;
    }
}