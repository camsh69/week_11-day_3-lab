package management ;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String niNumber, String name, int salary, String deptName) {
        super(niNumber, name, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
