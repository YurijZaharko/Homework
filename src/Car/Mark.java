package Car;

/**
 * Created by SCIP on 20.06.2016.
 */
public enum Mark {
    BMW("Z3 Roadster"), OPEL("Corsa D"), HONDA("CR-V"), FORD("Mustang");
    private final String model;

    Mark(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
