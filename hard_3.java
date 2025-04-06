import java.util.List;
import java.util.Scanner;

public class hard_3 {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    Student s = new Student(id, name, dept, marks);
                    controller.addStudent(s);
                    break;

                case 2:
                    List<Student> students = controller.getAllStudents();
                    for (Student stu : students) {
                        System.out.println(stu);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update marks: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter new marks: ");
                    double newMarks = sc.nextDouble();
                    controller.updateStudentMarks(uid, newMarks);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    controller.deleteStudent(did);
                    break;

                case 5:
                    controller.closeConnection();
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
