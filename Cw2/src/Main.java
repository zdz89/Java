import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://szgrabowski.kis.p.lodz.pl/zpo17/nazwiska.txt");
            Scanner s = new Scanner(url.openStream());

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        }
        catch(IOException ex) {
            // there was some connection problem, or the file did not exist on the server,
            // or your URL was not in the right format.
            // think about what to do now, and put it here.
            ex.printStackTrace(); // for now, simply output it.
        }
    }
}
