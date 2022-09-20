import ChapterTwoExercises.AppTwoIntegers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTwoIntegersTestTest {
    AppTwoIntegers appTwoIntegers;

    @BeforeEach
     void startAllTestWith() {
        appTwoIntegers = new AppTwoIntegers();
    }


    @Test
    void setAppTwoIntegers(){
        assertNotNull(appTwoIntegers);
    }
    @Test
    void SquareOfNumber1(){
        assertEquals(4,appTwoIntegers.SquareOfNumber1(2));
    }

    @Test
    void SquareOfNumber2(){
        assertEquals(9, appTwoIntegers.SquareOfNumber2(3) );
    }

    @Test
    void AddTwoNumbers(){
        assertEquals(9, appTwoIntegers.AddTwoNumbers(3,6));
    }

    @Test
    void SubTwoNumbers(){
        assertEquals(6, appTwoIntegers.SubTwoNumbers(12,6));
    }

}