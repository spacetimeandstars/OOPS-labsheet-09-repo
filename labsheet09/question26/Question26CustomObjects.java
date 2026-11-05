package labsheet09.question26;

import java.util.ArrayList;
import java.util.Iterator;

public class Question26CustomObjects {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Aarav"));
        students.add(new Student(102, "Neha"));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
