package labsheet09.question22;

import java.util.PriorityQueue;

public class Question22PriorityQueueRemove {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);

        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }
    }
}
