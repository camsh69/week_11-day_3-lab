import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("MN54321Y", "Zoe Ball", 54000);
    }

    @Test
    public void canGetNINumber() {
        assertEquals("MN54321Y", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetName() {
        assertEquals("Zoe Ball", databaseAdmin.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(54000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1500.00);
        assertEquals(55500, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(540.00, databaseAdmin.payBonus(), 0.0);
    }
}
