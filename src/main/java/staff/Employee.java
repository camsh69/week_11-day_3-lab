package staff;

public abstract class Employee {

    private String niNumber;
    private String name;
    private int salary;

    public Employee(String niNumber, String name, int salary) {
        this.niNumber = niNumber;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
