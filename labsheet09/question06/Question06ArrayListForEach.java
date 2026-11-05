package labsheet09.question06;

import java.util.ArrayList;

public class Question06ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aarav");
        names.add("Neha");
        names.add("Ravi");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
