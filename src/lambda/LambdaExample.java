package lambda;

/**
 * Класс LambdaExample
 *
 * @author Kamila Meshcheryakova
 * created 27.06.2020
 */
@SuppressWarnings("unused")
public class LambdaExample {
    public static void main(String[] args) {
        System.out.println(Summable.sum2(3.8,5));

        Summable<Integer> summable = new Summable<Integer>() {
            @Override
            public Integer sum(Integer a, Integer b) {
                return a + b;
            }
        };
        System.out.println(summable.sum(3, 6));

        Summable<Integer> summable2 = (x,y) -> x - y;
        System.out.println(summable2.sum(9, 5));

        // ссылка на класс с таким же контекстом:: ссылка на метод
        // new Summable().sum(T a, T b) = new Calc().sum(int a, int b)
        Summable<Integer> summable3 = new Calc()::sum;
        System.out.println(summable3.sum(4,7));

        // ссылка на класс с таким же контекстом:: ссылка на static метод
        // new Summable().sum(T a, T b) = Calc.sum(int a, int b)
        Summable<Integer> summable4 = Calc::sub;
        System.out.println(Summable.sum2(7.0, 9.0));

        // ссылка на класс с таким же контекстом:: constructor
        // Subtractable void sub(T a, T b) = Calc(int a, int b) - constructor
        Subtractable<Integer> sub = Calc::new;
        sub.sub(2, 4);

        Displayable<String> d = System.out::println;
        d.display("Hello World!");


    }
}
