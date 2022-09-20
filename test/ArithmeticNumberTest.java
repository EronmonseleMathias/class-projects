import Chapter6Exercise.ArithmeticNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Arithmetics;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticNumberTest {
    ArithmeticNumber number;

    @BeforeEach
    void toStartWith(){
    number = new ArithmeticNumber();
    }

    @Test
    void toTestIfObjectExist(){
        assertNotNull(number);
    }
    @Test
    void toTestForLargestNumber(){
        //given that
        //when i call this method
        number.largestNumber(2,7,5,9,4);
        //i expect
        assertEquals(9, number.largestNumber(2,7,5,9,4));
    }

    @Test
    void toTestSmallestNumber(){
        //when I
        number.smallestNumber(1,3,5,2,8);
        //I expect
        assertEquals(2, number.smallestNumber(2,4,5,7,9));
    }

}
