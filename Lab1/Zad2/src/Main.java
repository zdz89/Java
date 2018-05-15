import java.lang.*;
import java.math.BigInteger;

/**
 * <h1>NRBChecker</h1>
 * Program do sprawdzania poprawności
 * numeru rachunku bankowego
 *
 * @author KZ
 * @version 0.1
 * @since 2018-04-22
 */
public class Main {
    /**
     * Główna metoda weryfikująca numer NRB
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {
        String nrb = new String("86 1020 3916 0000 0502 0202 5161");
        System.out.println(CheckNRB(nrb));
        //* @exception IOException On input error.
        //* @see IOException
    }

    /**
     * Metoda weryfikuje numer NRB
     *
     * @param nrb Numer rachunku bankowego do sprawdzenia
     * @return boolean Zwraca prawda albo fałsz
     */
    private static boolean CheckNRB(String nrb)
    {
        nrb = nrb.replaceAll("[^0-9]","");

        if(nrb.length() == 26)
        {
            nrb = nrb + "2521";
            nrb = nrb.substring(2) + nrb.substring(0,2);

            BigInteger bi = new BigInteger(nrb);

            if(bi.mod(new BigInteger("97")).equals(new BigInteger("1")))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
