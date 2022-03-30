public class Student extends Person{
    private String studentID;
    private String grade;

    public Student(String name, String email, String studentId, String grade) {
        super(name, email,1);
        this.studentID = studentId;
        this.grade = grade;
    }

    public String getID() {
        return this.studentID;
    }

    public String getGrade() {
        return this.grade;
    }
}