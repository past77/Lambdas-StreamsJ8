package Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/**
 * Created by ppolozhe on 5/10/19.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Dima", "Danya", "Max", "Vova");
                Stream
                .iterate(0, n -> n +1 )
                .limit(name.size())
                .filter(odd -> odd % 2 == 0)
                .map(num -> num + 1 + "." + name.get(num))
                .forEach(
                        System.out::println
                );
    }
}