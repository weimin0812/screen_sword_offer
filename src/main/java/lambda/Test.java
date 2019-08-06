package lambda;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("inner class demo")).start();

        new Thread(() -> System.out.println("lambda")).start();

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.forEach(a -> System.out.println(a));
    }
}
