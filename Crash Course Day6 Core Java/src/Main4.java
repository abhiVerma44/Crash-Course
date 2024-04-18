
import java.io.*;
import java.util.ArrayList;
import java.util.List;
//Question 4
class Student implements Serializable {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}

public class Main4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 102));
        students.add(new Student("Charlie", 103));

        serializeToFile(students, "students.ser");

        List<Student> deserializedStudents = deserializeFromFile("students.ser");

        System.out.println("Deserialized Students:");
        for (Student student : deserializedStudents) {
            System.out.println(student);
        }
    }

    private static void serializeToFile(List<Student> students, String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(students);
            System.out.println("Serialization successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize list of students from a file
    private static List<Student> deserializeFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (List<Student>) inputStream.readObject();
            System.out.println("Deserialization successful.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
