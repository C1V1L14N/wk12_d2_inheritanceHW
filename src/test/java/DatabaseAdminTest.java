import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    Manager databaseAdmin;
    Employee employee;

    @Before
    public void setUp(){
        databaseAdmin = new Manager("Brian Swanson", "PP80085S", 17000.00, "Underwear");
    }

    @Test
    public void hasName(){
        assertEquals("Brian Swanson", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("PP80085S", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(17000.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Underwear", databaseAdmin.getDepartment());
    }

    @Test
    public void canSetName(){
        databaseAdmin.setName("Dave Langsberry");
        assertEquals("Dave Langsberry", databaseAdmin.getName());
    }

    @Test
    public void canSetNiNumber(){
        databaseAdmin.setNiNumber("PJ95969J");
        assertEquals("PJ95969J", databaseAdmin.getNiNumber());
    }

    @Test
    public void canSetSalary(){
        databaseAdmin.setSalary(17500.00);
        assertEquals(17500.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1700.00);
        assertEquals(18700, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(170.00, databaseAdmin.payBonus(), 0.01);
    }
}
