package method_types;

/**
 * Класс Car
 *
 * @author Kamila Meshcheryakova
 * created 27.06.2020
 */
@SuppressWarnings("unused")
public class Car {

    private String model;

    // predicate
    public boolean isRunning(String key) {
        return "2132".equals(key);
    }

    public Car(String model) {
        this.model = model;
    }
    // supplier
    public String getModel() {
        return model;
    }
    // consumer
    public void setModel(String model) {
        this.model = model;
    }
}
