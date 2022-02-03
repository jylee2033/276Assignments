public abstract class Person {
    protected String name;
    protected String email;
    protected int type;

    public Person(String name, String email, int type) {
        this.name = name;
        this.email = email;
        this.type = type;
    }

    abstract public String getID();
    abstract public String getGrade();

}