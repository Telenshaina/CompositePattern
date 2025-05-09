// Composite: Department

package Example;
import java.util.List;
import java.util.ArrayList;
public class Department implements OrganizationalComponent {
    private String name;
    private List<OrganizationalComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(OrganizationalComponent component) {
        components.add(component);
    }

    public void remove(OrganizationalComponent component) {
        components.remove(component);
    }

    public List<OrganizationalComponent> getChildren() {
        return components;
    }

    @Override
    public int getNumberOfEmployees() {
        int totalEmployees = 0;
        for (OrganizationalComponent component : components) {
            totalEmployees += component.getNumberOfEmployees();
        }
        return totalEmployees;
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        for (OrganizationalComponent component : components) {
            component.displayDetails();
        }
    }
}
