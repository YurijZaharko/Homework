package Car;


/**
 * Created by SCIP on 16.06.2016.
 */
public class Wheels {
    private final double size;
    private final boolean isSummerRubber;


    public Wheels(double size, boolean isSummerRubber) {
        this.size = size;
        this.isSummerRubber = isSummerRubber;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "size=" + size +
                ", isSummerRubber=" + isSummerRubber +
                '}';
    }

    public double getSize() {
        return size;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public void pumpWheels(){
        System.out.println("Pump Wheels");
    }



}
