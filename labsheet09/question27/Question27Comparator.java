package labsheet09.question27;

import java.util.ArrayList;
import java.util.Comparator;

public class Question27Comparator {
    private static class Student {
        private final int id;
        private final String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return id + ": " + name;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(103, "Ravi"));
        students.add(new Student(101, "Aarav"));
        students.add(new Student(102, "Neha"));

        students.sort(Comparator.comparingInt(student -> student.id));
        System.out.println(students);
    }
}
