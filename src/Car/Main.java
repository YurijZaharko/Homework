package Car;

/**
 * Created by SCIP on 16.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Handlebar handlebar = new Handlebar("Black", "Wood");
        Wheels wheels = new Wheels(15, true);
        Body body = new Body(4, wheels, "Car");
        Car car = new Car("Black", body, handlebar, "BMW");

        System.out.println(car);
        car.changeWheels(new Wheels(20,false));
        System.out.println(car);
        System.out.println(car.getColor());
        car.setColor("Yellow");
        System.out.println(car.getColor());
        car.pumpWheels();
        car.turnLeft();
    }
}
