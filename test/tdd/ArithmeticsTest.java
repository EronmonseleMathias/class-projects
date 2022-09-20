package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest {
    Arithmetics arithmetics;

    @BeforeEach
    void startAllTestWith() {
        arithmetics = new Arithmetics();

    }

    @Test
    void additionOfTwoIntegers(){
        assertEquals(93,arithmetics.addTwoNumber(80,13));
    }
    @Test
    void averageOfTheTwoIntegers(){
        assertEquals(20,arithmetics.squares(2,4));
    }
    @Test
    void testTheDifference(){
        assertEquals(12,arithmetics.difference(4,2));
    }


    }




