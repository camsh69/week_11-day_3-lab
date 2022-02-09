import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("XY12345Q", "Bob Smith", 40000, "Data" );
    }

    @Test
    public void canGetNINumber() {
        assertEquals("XY12345Q", manager.getNiNumber());
    }

    @Test
    public void canGetName() {
        assertEquals("Bob Smith", manager.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Data", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1500.00);
        assertEquals(41500.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, manager.payBonus(), 0.0);
    }
}
