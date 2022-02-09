package management;



public class Director extends Manager {

    private int budget;

    public Director(String niNumber, String name, int salary, String deptName, int budget) {
        super(niNumber, name, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return this.budget;
    }
}
