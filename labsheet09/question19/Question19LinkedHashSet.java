package labsheet09.question19;

import java.util.LinkedHashSet;

public class Question19LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Ravi");
        names.add("Aarav");
        names.add("Neha");
        names.add("Ravi");
        System.out.println(names);
    }
}
