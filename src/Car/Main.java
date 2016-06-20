package Car;

/**
 * Created by SCIP on 16.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Handlebar handlebar = new Handlebar("Black", "Wood");
        Wheels wheels = new Wheels(Wheel.WHEEL_15, true);
        Body body = new Body(4, wheels, "Car");
        Car car = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        System.out.println(car);
        car.changeWheels(new Wheels(Wheel.WHEEL_17,false));
        System.out.println(car);
        System.out.println(car.getColor());
        car.setColor(Color.YELLOW);
        System.out.println(car.getColor());
        car.pumpWheels();
        car.turnLeft();
        car.turnRight();
        car.setOpenTrunk();
        car.closeTrunk();
    }
}
