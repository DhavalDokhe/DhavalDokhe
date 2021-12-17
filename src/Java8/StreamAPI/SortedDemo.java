package Java8.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(66,8,88,44,9,21,33,78);

        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
