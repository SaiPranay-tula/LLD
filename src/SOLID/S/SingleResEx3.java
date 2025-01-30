package SOLID.S;

public class SingleResEx3 {
}
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void generatePaySlip() {
        System.out.println("Generating payslip for " + name);
    }

    public void saveToDatabase() {
        System.out.println("Saving employee record to database");
    }
}
