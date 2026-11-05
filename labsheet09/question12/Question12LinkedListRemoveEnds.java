package labsheet09.question12;

import java.util.LinkedList;

public class Question12LinkedListRemoveEnds {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Aarav");
        names.add("Neha");
        names.add("Ravi");

        System.out.println("Removed first: " + names.removeFirst());
        System.out.println("Removed last: " + names.removeLast());
        System.out.println("Remaining: " + names);
    }
}
