package labsheet09.question05;

import java.util.ArrayList;

public class Question05ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aarav");
        names.add("Ravi");
        names.set(1, "Neha");
        System.out.println(names);
    }
}
