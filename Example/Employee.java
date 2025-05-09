// Leaf: Employee
package Example;
public class Employee implements OrganizationalComponent {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public int getNumberOfEmployees() {
        return 1;
    }

    @Override
    public void displayDetails() {
        System.out.println("  Employee: " + name + " (" + role + ")");
    }
}
