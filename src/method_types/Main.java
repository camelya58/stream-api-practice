package method_types;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Класс Main
 *
 * @author Kamila Meshcheryakova
 * created 27.06.2020
 */
public class Main {
    public static void main(String[] args) {

        // intermediate operations
        // .map - function
        // .filter - predicate
        // .sorted

        // terminate operations
        // .collect
        // .forEach - consumer
        // reduce
        // max - function

        List<Double> doubles = new ArrayList<>();
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(x -> x % 2 == 0)
                .map(x -> {
                    doubles.add((double)x);
                    return (double)x;
                }) // Double :: valueOf
                .skip(1)
                .limit(2)
                .forEach(System.out::println);// x -> System.out.println(x)

        System.out.println(doubles.toString());

        double result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(x -> x % 2 == 0)
                .map(x -> {
                    doubles.add((double)x);
                    return (double)x;
                }) // Double :: valueOf
                .skip(1)
                .reduce(0d, Double::sum);

        System.out.println(result);
    }

}
