package labsheet09.question29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question29SetToList {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Aarav");
        set.add("Neha");
        set.add("Ravi");

        List<String> list = new ArrayList<>(set);
        for (String value : list) {
            System.out.println(value);
        }
    }
}
