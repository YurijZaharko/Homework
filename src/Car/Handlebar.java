package Car;

/**
 * Created by SCIP on 16.06.2016.
 */
public class Handlebar {
    private final String color;
    private final String materialOFHandlebar;

    public Handlebar(String color, String materialOFHandlebar) {
        this.color = color;
        this.materialOFHandlebar = materialOFHandlebar;
    }

    public String getColor() {
        return color;
    }

    public String getMaterialOFHandlebar() {
        return materialOFHandlebar;
    }

    @Override
    public String toString() {
        return "Handlebar{" +
                "color='" + color + '\'' +
                ", materialOFHandlebar='" + materialOFHandlebar + '\'' +
                '}';
    }

    public void turnLeft(){
        System.out.println("Turn left");
    }

    public void turnRight(){
        System.out.println("Turn right");
    }
}
