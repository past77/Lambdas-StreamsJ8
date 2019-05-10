package Task2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ppolozhe on 5/10/19.
 */
public class Task2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("map", "aberdeen", "collections", "lamdas", "streams");
        list
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
