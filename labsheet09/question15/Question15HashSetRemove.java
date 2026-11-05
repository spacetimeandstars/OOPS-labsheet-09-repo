package labsheet09.question15;

import java.util.HashSet;

public class Question15HashSetRemove {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Aarav");
        names.add("Neha");
        names.add("Ravi");

        names.remove("Neha");
        System.out.println(names);
    }
}
