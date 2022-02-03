import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Person student1 = new Student("Julia", "jylee2033@gmail.com", "301414539", "A"); // Create a Student object
        Person student2 = new Student("Jooyoung", "jylee233@naver.com", "301414539", "B");
        Person instructor1 = new Instructor("Saba", "saba@sfu.ca", "9413"); // Create an Instructor object
        Person instructor2 = new Instructor("Mohammad", "m_ganji@sfu.ca", "9808");
        Person instructor3 = new Instructor("Sadjad", "sadjad_tavakoli@sfu.ca", "9808");

        ArrayList<Person> personList = new ArrayList<Person> ();
        personList.add(student1);
        personList.add(student2);
        personList.add(instructor1);
        personList.add(instructor2);
        personList.add(instructor3);

        try {
            File myPersonList = new File("/Users/jylee233/276assignments/Assignment1 myPersonList.txt");
            if (myPersonList.createNewFile()) {
                System.out.println("File created: " + myPersonList.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        FileWriter writer = new FileWriter("myPersonList.txt");
        writer.write("[" + "\n");
        for(Person i : personList) {
            writer.write("{" + "\n" + "\"name\" : \"" + i.name + "\", \n");
            writer.write("\"email\" : \"" + i.email + "\", \n");
            if (i.type == 1) {
                writer.write("\"student ID\" : \"" + i.getID() + "\", \n");
                writer.write("\"grade\" : \"" + i.getGrade() + "\", \n");
            }
            else {
                writer.write("\"employee ID\" : \"" + i.getID() + "\", \n");
            }

            if (i == personList.get(personList.size() - 1)) {
                writer.write("}" + "\n");
            }
            else {
                writer.write("}" + ", \n");
            }
        }
        writer.write("]" + "\n");
        writer.close();
    }
}