import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer i = 0b1101_1011;

        try {
            while (true) {
                System.out.println("Wybierz konwersje liczby '0b1101_1011' (dziesiec | trzy | szesnascie):");
                String line = scanner.nextLine();

                switch(line){
                    case "dziesiec": System.out.println("Dziesietny: " + i);
                    break;
                    case "trzy": System.out.println("Trojkowy: " + i.toString(i, 3));
                    break;
                    case "szesnascie": System.out.println("Szesnastkowy: " + i.toString(i, 16).toUpperCase());
                    break;
                    default: System.out.println("Nierozpoznana metoda konwersji");
                }
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            System.out.println("Blad");
        }
    }
}
