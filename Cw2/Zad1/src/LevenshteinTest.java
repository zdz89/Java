import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevenshteinTest {

    Levenshtein levenshtein = new Levenshtein();

    @Test
    void levQWERTY() {
        assertEquals(levenshtein.LevQWERTY("kot","kita"),1.5);
        assertEquals(levenshtein.LevQWERTY("drab","dal"),(double)2);
    }
}