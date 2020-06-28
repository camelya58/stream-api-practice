package lambda;

/**
 * Класс Summable
 *
 * @author Kamila Meshcheryakova
 * created 27.06.2020
 */
@FunctionalInterface
public interface Summable<T> {
    // since 1.1
    // abstract methods
    T sum(T a, T b);

    // since 1.2
    // Collection framework

    // constants
    int MIN = 0;

    // since 1.5
    // generics <T>

    // since 1.8
    // default methods
    default double sum2(int a, int b) {
       return (a + b);
    }
    // static methods
    static double sum2(double a, double b) {
        return (a + b);
    }
}
