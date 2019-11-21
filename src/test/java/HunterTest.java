import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

class HunterTest {

    @Test
    void HuntTest() {
        Hunter michel = new Hunter("michel","hunt",100);
        michel.Hunt("gnomy");
        out.println(michel.getStock());
    }

    /**
     * Test to highlight the fact that the stock is common to everyone
     */
    @Test
    void HuntToStockTest(){
        Hunter michel = new Hunter("michel","hunt",100);
        michel.Hunt("gnomy");
        out.println(michel.getStock());
        Hunter jean = new Hunter("jean", "sairien",100);
        jean.Hunt("gnomo");
        out.println(jean.getStock());
    }
}
