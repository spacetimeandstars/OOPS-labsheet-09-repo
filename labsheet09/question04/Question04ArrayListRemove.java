package labsheet09.question04;

import java.util.ArrayList;

public class Question04ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.remove(1);
        System.out.println("Removed by index: " + numbers);

        numbers.remove(Integer.valueOf(30));
        System.out.println("Removed by value: " + numbers);
    }
}
