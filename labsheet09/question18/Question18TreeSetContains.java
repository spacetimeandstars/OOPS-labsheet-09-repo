package labsheet09.question18;

import java.util.TreeSet;

public class Question18TreeSetContains {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Aarav");
        names.add("Neha");
        names.add("Ravi");

        System.out.println("Contains Neha: " + names.contains("Neha"));
        System.out.println("Contains Amit: " + names.contains("Amit"));
    }
}
