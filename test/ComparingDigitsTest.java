import ChapterTwoExercises.comparingDigits;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingDigitsTest {
    ComparingDigits comparingDigits;


    @BeforeEach
   void StartEveryTestWith() {
         comparingDigits = new ComparingDigits();
    }
    @Test
    void comparingDigits(){
        assertNotNull(comparingDigits);
    }

    @Test
    void numGreaterThanHundred(){
        assertEquals(false, comparingDigits.squareNumGreaterThanHundred(25));
    }
    @Test
    void numLesserThanHundred(){
        assertEquals(false, comparingDigits.numlesserThanHundred(20) );
    }
    @Test
    void numEqualTo(){
        assertEquals(false, comparingDigits.numEqualTo(10));
    }
    @Test
    void numNotEqualTo(){
        assertEquals(true, comparingDigits.numNotEqualTo(8));
    }

    @Test
    void  squareNum1GreaterThanHundred(){
        assertEquals(true, comparingDigits.squareNum1GreaterThanHundred(25));
    }
    @Test
    void squareNum2LesserThanHundred(){
        assertEquals(true, comparingDigits.squareNum2LesserThanHundred(8));
    }

    @Test
    void squareNum3IsEqualToHundred(){
        assertEquals(true, comparingDigits.squareNum3EqualToHundred(10));
    }

    @Test
    void squareNum4IsNotEqualToHundred(){
        assertEquals(true, comparingDigits.squareNum4IsNotEqualToHundred(9));

    }




    }

