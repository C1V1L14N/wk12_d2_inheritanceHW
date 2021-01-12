import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {


    Manager developer;
    @Before
    public void setUp(){
        developer = new Manager("Brian Swanson", "PP80085S", 17000.00, "Underwear");
    }

    @Test
    public void hasName(){
        assertEquals("Brian Swanson", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("PP80085S", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(17000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Underwear", developer.getDepartment());
    }

    @Test
    public void canSetName(){
        developer.setName("Dave Langsberry");
        assertEquals("Dave Langsberry", developer.getName());
    }

    @Test
    public void canSetNiNumber(){
        developer.setNiNumber("PJ95969J");
        assertEquals("PJ95969J", developer.getNiNumber());
    }

    @Test
    public void canSetSalary(){
        developer.setSalary(17500.00);
        assertEquals(17500.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1700.00);
        assertEquals(18700, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(170.00, developer.payBonus(), 0.01);
    }

}
