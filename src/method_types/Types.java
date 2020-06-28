package method_types;

/**
 * Класс Consumer
 *
 * @author Kamila Meshcheryakova
 * created 27.06.2020
 */
@SuppressWarnings("unused")
public interface Types {

    // consumer - только принимает
    void consumer(Object... data);

    // supplier - только возвращает
    Object supplier();

    // predicate - все принимает и возвращает boolean
    boolean predicate(Object... data);

    // function - все принимает и все возвращает
    Object function(Object... data);

}
