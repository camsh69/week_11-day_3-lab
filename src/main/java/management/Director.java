package management;



public class Director extends Manager {

    private int budget;
    private int salary;

    public Director(String niNumber, String name, int salary, String deptName, int budget) {
        super(niNumber, name, salary, deptName);
        this.budget = budget;
        this.salary = salary;
    }

    public int getBudget() {
        return this.budget;
    }

    public double payBonus() {
        return this.salary * 0.02;
    }
}
