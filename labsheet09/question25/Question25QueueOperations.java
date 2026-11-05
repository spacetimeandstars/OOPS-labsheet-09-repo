package labsheet09.question25;

import java.util.LinkedList;
import java.util.Queue;

public class Question25QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Remaining: " + queue);
    }
}
