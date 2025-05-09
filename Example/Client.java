package Example;// Client Code
public class Client {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe", "Software Engineer");
        Employee jane = new Employee("Jane Smith", "UX Designer");

        Department development = new Department("Development");
        development.add(john);
        development.add(jane);

        Employee alice = new Employee("Alice Brown", "QA Engineer");
        Department testing = new Department("Testing");
        testing.add(alice);

        Department engineering = new Department("Engineering");
        engineering.add(development);
        engineering.add(testing);

        System.out.println("Total employees in Engineering: " + engineering.getNumberOfEmployees());
        System.out.println("\nDetails of Engineering Department:");
        engineering.displayDetails();
    }
}

