package Car;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SCIP on 16.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Car> linkedList = new LinkedList<>();
        Service service = new Service(linkedList);
        Scanner scanner = new Scanner(System.in);

        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(16, true);
        Body body = new Body(4, wheels, TypeOfBody.CAR);
        Car car = new Car(Color.BLACK, body, handlebar,Mark.BMW);
        service.addCarToList(car);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Wood", true);
        Wheels wheels1 = new Wheels(15, true);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car1 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);
        service.addCarToList(car1);

        Handlebar handlebar2 = new Handlebar(Color.WHITE, "Wood", false);
        Wheels wheels2 = new Wheels(19, false);
        Body body2 = new Body(4,wheels2, TypeOfBody.CAR);
        Car car2 = new Car(Color.BLUE, body2, handlebar2, Mark.OPEL);
        service.addCarToList(car2);

        Handlebar handlebar3 = new Handlebar(Color.GREEN, "Wood", false);
        Wheels wheels3 = new Wheels(13, false);
        Body body3 = new Body(4,wheels3, TypeOfBody.CAR);
        Car car3 = new Car(Color.YELLOW, body3, handlebar3, Mark.BMW);
        service.addCarToList(car3);

        Handlebar handlebar4 = new Handlebar(Color.WHITE, "Steel", true);
        Wheels wheels4 = new Wheels(23, false);
        Body body4 = new Body(8,wheels4, TypeOfBody.TRUCK);
        Car car4 = new Car(Color.BLACK, body4, handlebar4, Mark.FORD);
        service.addCarToList(car4);

        service.findCar(service.read(scanner, "Please enter diameter of wheels: "));
        service.findCar(service.read(scanner, "Please enter diameter of wheels: "), Color.RED);
        service.changeInRedCars(new Handlebar(Color.GREEN, "Plastic", false));
        service.changeSizeOfWheels();

        Handlebar handlebar5 = new Handlebar(Color.WHITE, "Steel", true);
        Wheels wheels5 = new Wheels(23, false);
        Body body5 = new Body(8,wheels5, TypeOfBody.TRUCK);
        Car car5 = new Car(Color.BLACK, body5, handlebar5, Mark.FORD);
        service.changeCarWithSizeOfWheels(service.read(scanner,  "Please enter diameter of wheels: "), car5);
    }
}
