package Car;

/**
 * Created by SCIP on 16.06.2016.
 */
public class Handlebar {
    Color color;
    private final String materialOFHandlebar;
    private final boolean button;

    public Handlebar(Color color, String materialOFHandlebar, boolean button) {
        this.color = color;
        this.materialOFHandlebar = materialOFHandlebar;
        this.button = button;
    }

    public Color getColor() {
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

    public boolean isButton() {
        return button;
    }
}
