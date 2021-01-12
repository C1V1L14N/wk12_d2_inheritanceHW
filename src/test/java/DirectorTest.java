import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Bill Billington", "JG90210W", 1000000.00, "Technical", 500.00);
    }

    @Test
    public void canGetBudget(){
        assertEquals(500.00, director.getBudget(), 0.1);
    }

    @Test
    public void canPayDirectorBonus(){
        assertEquals(20000.00, director.payBonus(), 0.01);
    }

}
