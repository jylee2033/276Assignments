public class Instructor extends Person{
    private String employeeID;

    public Instructor(String name, String email, String employeeID) {
        super(name, email, 2);
        this.employeeID = employeeID;
    }

    public String getID() {
        return this.employeeID;
    }

    public String getGrade() {
        return "";
    }
}