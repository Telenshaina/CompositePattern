import java.util.ArrayList;
import java.util.List;

public class Departments implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Departments(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getNumberOfStudents() {
        int totalStudents = 0;
        for (Component component : components) {
            totalStudents += component.getNumberOfStudents();
        }
        return totalStudents;
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        for (Component component : components) {
            component.displayDetails();
        }
    }

    @Override
    public double calculateBudget() {
        double totalBudget = 0;
        for (Component component : components) {
            totalBudget += component.calculateBudget();
        }
        return totalBudget;
    }
}
