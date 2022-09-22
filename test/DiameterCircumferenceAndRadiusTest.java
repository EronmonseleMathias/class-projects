import ChapterTwoExercises.DiameterCircumferenceAndRadius;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterCircumferenceAndRadiusTest {
    DiameterCircumferenceAndRadius diameterCircumferenceAndRadius;

    @BeforeEach
    void startAllTestWith(){
        diameterCircumferenceAndRadius = new DiameterCircumferenceAndRadius();
    }
    @Test
    void diameterCircumferenceAndRadius(){
        assertNotNull(diameterCircumferenceAndRadius);
    }

    @Test
    void obtainANumber(){
        assertEquals(0, diameterCircumferenceAndRadius.obtainANumber(0));
    }

    @Test
    void findDiameter(){
        assertEquals(6.28318, diameterCircumferenceAndRadius.findDiameter(2,3.14159));
    }
    @Test
    void findCircumference(){
        assertEquals(18.849539999999998, diameterCircumferenceAndRadius.findCircumference(2, 22/7, 3.14159));
    }
    @Test
    void findArea(){
        assertEquals(29.608763184299995, diameterCircumferenceAndRadius.findArea(22/7, 3.14159, 3.14159));
    }




    }


