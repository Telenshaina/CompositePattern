public class Students implements Component {
    private String name;
    private String studentID;
    private double tuitionFee;

    public Students(String name, String studentID, double tuitionFee) {
        this.name = name;
        this.studentID = studentID;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getNumberOfStudents() {
        return 1;
    }

    @Override
    public void displayDetails() {
        System.out.println("  Student: " + name + " (ID: " + studentID + ", Tuition: $" + tuitionFee + ")");
    }

    @Override
    public double calculateBudget() {
        return -tuitionFee;
    }
}
