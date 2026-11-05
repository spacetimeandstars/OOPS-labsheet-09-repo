package labsheet09.question16;

import java.util.HashSet;
import java.util.Iterator;

public class Question16HashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
