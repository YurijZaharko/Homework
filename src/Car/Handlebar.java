package Car;

import java.util.Objects;

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



    public String getMaterialOFHandlebar() {
        return materialOFHandlebar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Handlebar)) return false;
        Handlebar handlebar = (Handlebar) o;
        return button == handlebar.button &&
                color == handlebar.color &&
                Objects.equals(materialOFHandlebar, handlebar.materialOFHandlebar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, materialOFHandlebar, button);
    }

    @Override
    public String toString() {
        return "Handlebar{" +
                "color='" + color + '\'' +
                ", materialOFHandlebar='" + materialOFHandlebar + '\'' +
                '}';
    }

    public Color getColor() {
        return color;
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
