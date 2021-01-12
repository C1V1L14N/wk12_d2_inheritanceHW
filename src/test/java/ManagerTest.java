import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Employee employee;

    @Before
    public void setUp(){
        manager = new Manager("Brian Swanson", "PP80085S", 17000.00, "Underwear");
    }

    @Test
    public void hasName(){
        assertEquals("Brian Swanson", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("PP80085S", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(17000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Underwear", manager.getDepartment());
    }

    @Test
    public void canSetName(){
        manager.setName("Dave Langsberry");
        assertEquals("Dave Langsberry", manager.getName());
    }

    @Test
    public void canSetNiNumber(){
        manager.setNiNumber("PJ95969J");
        assertEquals("PJ95969J", manager.getNiNumber());
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(17500.00);
        assertEquals(17500.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1700.00);
        assertEquals(18700, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(170.00, manager.payBonus(), 0.01);
    }


}
