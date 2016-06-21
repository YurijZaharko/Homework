package Car;

/**
 * Created by SCIP on 16.06.2016.
 */
public class Car {
    private Body body;
    private Wheels wheels;
    private Handlebar handlebar;
    private final Mark name;
    private Color color;

    public Car(Color color, Body body, Handlebar handlebar, Mark name) {
        this.color = color;
        this.body = body;
        this.wheels = getWheel();
        this.handlebar = handlebar;
        this.name = name;
    }


    public Mark getName() {
        return name;
    }

    public Color getColorOfCar() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void changeWheels(Wheels newWheels){
        removeAllWeels();
        add(newWheels);
        System.out.println("Changing and pumping");
        pumpWheels();
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

    public int getSizeOfWheels() {
        return wheels.getSize();
    }

    public void setSizeOfWheels(int size) {
        wheels.setSize(size);
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

    public void setHandlebar(Handlebar handlebar) {
        this.handlebar = handlebar;
    }

    public boolean isButtonInHandlebar() {
        return handlebar.isButton();
    }
}
