import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HunterTest {

    @Test
    void hunt() {
        Hunter Hunter = new Hunter("Michel","Michel");
        Hunter.Hunt("Jackie");

    }
}