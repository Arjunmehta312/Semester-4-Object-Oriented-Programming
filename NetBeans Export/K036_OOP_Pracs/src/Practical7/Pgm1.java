package Practical7;

class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter method
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Get annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Raise salary by percentage
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    // Main method to test
    public static void main(String[] args) {
        Employee emp = new Employee(89, "Steve", "Jackson", 3000);
        emp.raiseSalary(10);
        System.out.println(emp);
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
    }
}
