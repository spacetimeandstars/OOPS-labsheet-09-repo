package labsheet09.question13;

import java.util.LinkedList;

public class Question13LinkedListRetrieveEnds {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Aarav");
        names.add("Neha");
        names.add("Ravi");

        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());
    }
}
