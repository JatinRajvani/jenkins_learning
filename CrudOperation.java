import java.util.*;

public class CrudOperation {

    static class Student {
        int id;
        String name;
        int age;

        Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("===== CRUD OPERATIONS (AUTO MODE) =====");

        // 🔹 INSERT
        System.out.println("\n[INSERT]");
        students.add(new Student(1, "Jatin", 20));
        students.add(new Student(2, "Raj", 22));
        students.add(new Student(3, "Amit", 21));
        System.out.println("Data Inserted Successfully!");

        // 🔹 READ
        System.out.println("\n[READ]");
        printStudents(students);

        // 🔹 UPDATE (update id = 2)
        System.out.println("\n[UPDATE]");
        int updateId = 2;
        boolean updated = false;

        for (Student s : students) {
            if (s.id == updateId) {
                s.name = "Raj Updated";
                s.age = 23;
                updated = true;
                break;
            }
        }

        System.out.println(updated ? "Updated Successfully!" : "Record Not Found!");
        printStudents(students);

        // 🔹 DELETE (delete id = 1)
        System.out.println("\n[DELETE]");
        int deleteId = 1;
        boolean deleted = students.removeIf(s -> s.id == deleteId);

        System.out.println(deleted ? "Deleted Successfully!" : "Record Not Found!");
        printStudents(students);

        System.out.println("\nProgram Finished Successfully!");
    }

    // Utility method
    public static void printStudents(ArrayList<Student> students) {
        System.out.println("ID\tNAME\tAGE");
        for (Student s : students) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.age);
        }
    }
}