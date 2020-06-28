package lambda;

/**
 * Класс Calc
 *
 * @author Kamila Meshcheryakova
 * created 27.06.2020
 */
public class Calc {

    int a;
    int b;

    public Calc() {
    }

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum(int a, int b) {
        return  a + b;
    }

    static int sub(int a, int b) {
        return  a - b;
    }
}
