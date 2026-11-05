package labsheet09.question23;

import java.util.PriorityQueue;

public class Question23PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(25);
        queue.add(5);
        queue.add(15);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Size after peek: " + queue.size());
    }
}
