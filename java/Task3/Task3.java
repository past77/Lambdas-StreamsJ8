package Task3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ppolozhe on 5/10/19.
 */
public class Task3 {

    public static void main(String[] args) {
        List<String> array = Arrays.asList("1, 3, 5", "5, 1, 7, 7");
        array
                .stream()
                .flatMap(str -> Arrays.stream(str.split("[\\s.,]+")))
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
