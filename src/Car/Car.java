package Car;

/**
 * Created by SCIP on 16.06.2016.
 */
public class Car {
    private Body body;
    private Wheels wheels;
    private Handlebar handlebar;
    private final String name;
    private String color;

    public Car(String color, Body body, Handlebar handlebar, String name) {
        this.color = color;
        this.body = body;
        this.wheels = getWheel();
        this.handlebar = handlebar;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void changeWheels(Wheels newWheels){
        removeAllWeels();
        add(newWheels);
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", wheels=" + wheels +
                ", handlebar=" + handlebar +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Wheels getWheel() {
        return body.getWheel();
    }

    private void add(Wheels element) {
        body.add(element);
    }

    public void removeAllWeels() {
        body.removeAll();
    }

    public void setOpenTrunk() {
        body.setOpenTrunk();
    }

    public void closeTrunk() {
        body.closeTrunk();
    }

    public int numbersOFWheels() {
        return body.size();
    }

    public double getSize() {
        return wheels.getSize();
    }

    public boolean isSummerRubber() {
        return wheels.isSummerRubber();
    }

    public void pumpWheels() {
        wheels.pumpWheels();
    }

    public void turnLeft() {
        handlebar.turnLeft();
    }

    public String getMaterialOFHandlebar() {
        return handlebar.getMaterialOFHandlebar();
    }

    public void turnRight() {
        handlebar.turnRight();
    }
}
