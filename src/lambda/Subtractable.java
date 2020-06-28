package lambda;

/**
 * Класс Subtractable
 *
 * @author Kamila Meshcheryakova
 * created 27.06.2020
 */
@FunctionalInterface
public interface Subtractable<T> {

    void sub(T a, T b);
}
