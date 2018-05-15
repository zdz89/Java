import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ones[] = {"", " jeden", " dwa", " trzy", " cztery", " piec", " szesc", " siedem", " osiem", " dziewiec"};
        String teens[] = {"dziesiec", " jedeteens", " dwateens", " trzyteens", " czterteens", " pietteens", " szesteens", " siedemteens", " osiemteens", " dziewietteens"};
        String tens[] ={"", " dziesiec", " dwadziescia", " trzydziesci", " czterdziesci", " piecdziesiat", " szescdziesiat", " siedemdziesiat", " osiemdziesiat", " dziewiecdziesiat"};
        String hundreds[] = {"", " sto", " dwiescie", " trzysta", " czterysta", " piecset", " szescset", " siedemset", " osiemset", " dziewiecset"};

        String result = "";
        String input;
        int number = 0, end;
        int row = 0;
        int j = 0;

        System.out.println("Podaj liczbe do zamiany na slowa\n");
        input = scanner.nextLine();

        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Nieprawidłowy format wprowadzonej liczby");
            return;
        }

        try {
            if (number<0 || input.charAt(0) == '0' || input.length() > 3)
            {
                throw new MyException("Moj wyjatek");
            }
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
            return;
        }

        if (number == 0) result="zero";

        while (number>0)
        {
            end = (number%10);
            number /= 10;
            if ((j==0) && (number % 10 != 1)) result = ones[end] + result;
            if ((j==0) && (number % 10 == 1))
            {
                result = teens[end] + result;
                number /= 10;
                j += 2;
                continue;
            }
            if (j == 1) result = tens[end] + result;
            if (j == 2)
            {
                result = hundreds[end] + result;
                j = -1;
                row++;
            }
            j++;
        }

        System.out.println("Odpowiedz: " + result);
    }

    public static class MyException extends Exception {
        public MyException() { super(); }
        public MyException(String message) { super(message); }
        public MyException(String message, Throwable cause) { super(message, cause); }
        public MyException(Throwable cause) { super(cause); }
    }
}
