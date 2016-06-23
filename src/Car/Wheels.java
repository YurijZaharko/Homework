package Car;


/**
 * Created by SCIP on 16.06.2016.
 */
public class Wheels {
    private int size;
    private  boolean isSummerRubber;


    public Wheels(int size, boolean isSummerRubber) {
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public void pumpWheels(){
        System.out.println("Pumping Wheels");
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }
}
