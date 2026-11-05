package labsheet09.question11;

import java.util.LinkedList;

public class Question11LinkedListEnds {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.addFirst("First");
        names.addLast("Last");
        names.addFirst("New First");
        System.out.println(names);
    }
}
