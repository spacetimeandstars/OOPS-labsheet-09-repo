package labsheet09.question09;

import java.util.ArrayList;
import java.util.Collections;

public class Question09ReverseStrings {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aarav");
        names.add("Neha");
        names.add("Ravi");

        Collections.reverse(names);
        System.out.println(names);
    }
}
