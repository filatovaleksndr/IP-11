package fit.knu.ua.TA;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void Laba2Test()
    {
        Lab2 lab2 = new Lab2();
        assertEquals(lab2.CalculateFormula(1, 10, 5, 5), 1);
        assertEquals(lab2.CalculateFormula(1, 2, 1, 1), 0);
        assertEquals(lab2.CalculateFormula(1, 0, 0, 0), Integer.MAX_VALUE);
    }

}
