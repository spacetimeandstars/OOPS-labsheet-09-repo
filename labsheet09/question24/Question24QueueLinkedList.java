package labsheet09.question24;

import java.util.LinkedList;
import java.util.Queue;

public class Question24QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Aarav");
        queue.add("Neha");
        queue.add("Ravi");

        System.out.println("Removed: " + queue.remove());
        System.out.println("Remaining: " + queue);
    }
}
