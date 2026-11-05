package labsheet09.question30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Question30ClearCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        Set<Integer> set = new HashSet<>();
        set.add(30);
        set.add(40);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(50);
        queue.add(60);

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Queue: " + queue);
    }
}
