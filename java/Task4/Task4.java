package Task4;

import java.util.stream.Stream;

/**
 * Created by ppolozhe on 5/10/19.
 */
public class Task4 {
    public static void main(String[] args) {
        Task4 random = new Task4();
        random.random(23324L, 2321L, 321332l, 0L);

        }
     private void random( long a, long b, long m, long seed){
        Stream
                .iterate(seed, n -> (a * n + b) % m)
                .limit(42)
                .forEach(System.out::println);
    }
}
