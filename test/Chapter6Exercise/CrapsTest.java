package Chapter6Exercise;

import ClassworkAndAssignment.Craps;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrapsTest {

    @Test
    public void whenSumOfDiceIs7(){
        Craps craps = new Craps();
        craps.sumOfDice = 7;
        assertEquals(Craps.Status.WON, craps.getGameStatus());
    }
}