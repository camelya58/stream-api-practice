package lambda;

/**
 * Класс Displayable
 *
 * @author Kamila Meshcheryakova
 * created 27.06.2020
 */
@FunctionalInterface
public interface Displayable<T> {

    void display(T data);
}
