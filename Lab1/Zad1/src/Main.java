import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer i = 0b1101_1011;

        try {
            while (true) {
                System.out.println("Wybierz konwersje liczby '0b1101_1011' (10 lub 3 lub 16):");
                String line = scanner.nextLine();

                switch(line){
                    case "10": System.out.println("Dziesietny: " + i);
                    break;
                    case "3": System.out.println("Trojkowy: " + i.toString(i, 3));
                    break;
                    case "16": System.out.println("Szesnastkowy: " + i.toString(i, 16).toUpperCase());
                    break;
                    default: System.out.println("Nierozpoznana metoda konwersji");
                }
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            System.out.println("Blad");
        }
    }
}
