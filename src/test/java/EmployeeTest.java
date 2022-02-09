import management.Director;
import management.Manager;
import org.junit.Test;
import staff.Employee;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void managerAsEmployee() {
        employee = new Manager("XY12345Q", "Bob Smith", 40000, "Data" );
        assertEquals("XY12345Q", employee.getNiNumber());
        assertEquals("Bob Smith", employee.getName());
        assertEquals(40000, employee.getSalary());
        employee.raiseSalary(1500.00);
        assertEquals(41500, employee.getSalary(), 0.0);
        assertEquals(415.00, employee.payBonus(), 0.0);
    }

    @Test
    public void directorAsEmployee() {
        employee = new Director("QW412563S", "Pepa Pig", 80000, "Technology", 1000000);
        assertEquals("QW412563S", employee.getNiNumber());
        assertEquals("Pepa Pig", employee.getName());
        assertEquals(80000, employee.getSalary());
        employee.raiseSalary(1500.00);
        assertEquals(81500, employee.getSalary(), 0.0);
        assertEquals(1600.00, employee.payBonus(), 0.0);
    }

    @Test
    public void developerAsEmployee() {
        employee = new Developer("MN54321B", "Chloe Ball", 54000);
        assertEquals("MN54321B", employee.getNiNumber());
        assertEquals("Chloe Ball", employee.getName());
        assertEquals(54000, employee.getSalary());
        employee.raiseSalary(1500.00);
        assertEquals(55500, employee.getSalary(), 0.0);
        assertEquals(555.00, employee.payBonus(), 0.0);
    }

    @Test
    public void databaseAdminAsEmployee() {
        employee = new DatabaseAdmin("MN54321Y", "Zoe Ball", 54000);
        assertEquals("MN54321Y", employee.getNiNumber());
        assertEquals("Zoe Ball", employee.getName());
        assertEquals(54000, employee.getSalary());
        employee.raiseSalary(1500.00);
        assertEquals(55500, employee.getSalary(), 0.0);
        assertEquals(555.00, employee.payBonus(), 0.0);
    }


}
