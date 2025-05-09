public class Client {
    public static void main(String[] args) {
        // teachers
        Teachers prof1 = new Teachers("Jerry Esperanza", "Computer Science", 50000);
        Teachers prof2 = new Teachers("Edilberto Simbulan", "Information Technology", 55000);
        Teachers prof3 = new Teachers("Era Espinas", "Multimedia", 45000);

        //students
        Students studentA = new Students("Shaina Telen", "2023-101", 27000);
        Students studentB = new Students("Faye Buri", "2023-102", 25200);
        Students studentC = new Students("Louise Venus", "2024-201", 30000);
        Students studentD = new Students("John Keith", "2024-202", 35100);

        //departments
        Departments csDepartment = new Departments("Department of Computer Science");
        csDepartment.addComponent(prof1);
        csDepartment.addComponent(studentA);
        csDepartment.addComponent(studentB);

        Departments itDepartment = new Departments("Department of Information Technology");
        itDepartment.addComponent(prof2);
        itDepartment.addComponent(studentC);

        // Create a college
        Colleges cicsCollege = new Colleges("College of Informatics and Computer Science");
        cicsCollege.addComponent(csDepartment);
        cicsCollege.addComponent(itDepartment);
        cicsCollege.addComponent(prof3); 
        cicsCollege.addComponent(studentD); 

        // Display details 
        System.out.println("--- Details of " + cicsCollege.getName() + " ---");
        cicsCollege.displayDetails();
        System.out.println();
        System.out.println();

        // Calculate and display the total number of students
        System.out.println("Total number of students in " + cicsCollege.getName() + ": " + cicsCollege.getNumberOfStudents());
        System.out.println();
        System.out.println();

        // Calculate and display the total budget of the CICS
        System.out.println("Total budget of " + cicsCollege.getName() + ": $" + cicsCollege.calculateBudget());
    }
}