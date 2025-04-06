public class hard_1 {
    private int studentId;
    private String name;
    private String department;
    private double marks;

    public Student(int studentId, String name, String department, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Dept: %s | Marks: %.2f", studentId, name, department, marks);
    }
}
