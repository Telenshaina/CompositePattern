public class Teachers implements Component {
    private String name;
    private String subject;
    private double salary;

    public Teachers(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public int getNumberOfStudents() {
        return 0; // Teachers don't directly count as students
    }

    @Override
    public void displayDetails() {
        System.out.println("  Teacher: " + name + " (Subject: " + subject + ", Salary: $" + salary + ")");
    }

    @Override
    public double calculateBudget() {
        return salary;
    }
}
