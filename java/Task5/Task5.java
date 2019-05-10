package Task5;

import java.util.Iterator;
import java.util.stream.Stream;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by ppolozhe on 5/10/19.
 */
public class Task5 {
    public static void main(String[] args) {

        Task5 task5 = new Task5();

        Stream<Integer> integerStream1 = Stream.of(30, 50, 70, 90, 10);
        Stream<Integer> integerStream2 = Stream.of(20, 40, 60, 80, 0, 100);
        task5.zip(integerStream1, integerStream2)
                .forEach(System.out::println);
    }

    private <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Stream<T> retStream = Stream.empty();
        Iterator<T> left = first.iterator();
        Iterator<T> right = second.iterator();
        while (left.hasNext()
                && right.hasNext()) {
            Stream<Object> build = Stream.builder()
                    .add(left.next())
                    .add(right.next())
                    .build();
            retStream = Stream.concat(retStream, (Stream<? extends T>) build);
        }
        return retStream;
    }
}
