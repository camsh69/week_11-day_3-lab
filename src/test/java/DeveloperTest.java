import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("MN54321B", "Chloe Ball", 54000);
    }

    @Test
    public void canGetNINumber() {
        assertEquals("MN54321B", developer.getNiNumber());
    }

    @Test
    public void canGetName() {
        assertEquals("Chloe Ball", developer.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(54000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1500.00);
        assertEquals(55500, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(540.00, developer.payBonus(), 0.0);
    }
}

