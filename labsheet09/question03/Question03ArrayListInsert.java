package labsheet09.question03;

import java.util.ArrayList;

public class Question03ArrayListInsert {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(1, 20);
        System.out.println(numbers);
    }
}
