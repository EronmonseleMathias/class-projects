import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestTest {
    CalculatorTest calculatorTest;

    @BeforeEach
    void StartAllTestWith(){
        calculatorTest = new CalculatorTest();
    }

    @Test
    void CalculatorTest(){
        assertNotNull(calculatorTest);
    }

    @Test
    void addTwoNumbers(){
        assertEquals(50, calculatorTest.addTwoNumbers(30, 20));
    }

    @Test
    void squareOfNum1(){
        assertEquals(49, calculatorTest.squareOfNum1(7));
    }

    @Test
    void multiplyTwoNums(){
        assertEquals(4, calculatorTest.multiplyTwonums(2,2));
    }
    @Test
    void subtractTwoNums(){
        assertEquals(5, calculatorTest.subtractnums(10,5));
    }
    @Test
    void divideThreeNums(){
        assertEquals(5, calculatorTest.divideThreeNums(50, 2, 5));
    }


}