import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("QW412563S", "Pepa Pig", 80000, "Technology", 1000000);
    }

    @Test
    public void canGetNINumber() {
        assertEquals("QW412563S", director.getNiNumber());
    }

    @Test
    public void canGetName() {
        assertEquals("Pepa Pig", director.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(80000, director.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Technology", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1500.00);
        assertEquals(81500, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1600.00, director.payBonus(), 0.0);
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000, director.getBudget());
    }
}
