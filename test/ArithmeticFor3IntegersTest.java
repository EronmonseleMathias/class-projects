import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticFor3IntegersTest {
    ArithmeticFor3Integers arithmeticFor3Integers;

    @BeforeEach
    void StartAllTestWith() {
        arithmeticFor3Integers = new ArithmeticFor3Integers();
    }

            @Test
            void arithmeticFor3Integers() {
                assertNotNull(arithmeticFor3Integers);
            }
            @Test
            void sumOf3Integers(){
                assertEquals(9, arithmeticFor3Integers.sumOf3Integers(3,3,3));
            }
            @Test
            void averageOf3Integers(){
            assertEquals(3, arithmeticFor3Integers.averageOf3Integers(3, 3, 3));
            }
            @Test
            void productOf3Integers(){
            assertEquals(27, arithmeticFor3Integers.productOf3Integers(3, 3, 3));
            }

            @Test
            void smallestOf3Integers(){
            assertEquals(3, arithmeticFor3Integers.smallestOf3Integers(3, 2, 1));
            }

            @Test
            void largestOf3Integers(){
            assertEquals(1, arithmeticFor3Integers.largestOf3Integers(2, 3, 1));
            }


}