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
        service.updateListOfCar();


        service.findCar(service.readInt(scanner, "Please enter diameter of wheels: "));
        service.findCar(service.readInt(scanner, "Please enter diameter of wheels: "), service.readString(scanner, "Please enter color "));
        service.changeInRedCars(new Handlebar(Color.GREEN, "Plastic", false));
        service.changeSizeOfWheels();

        Handlebar handlebar5 = new Handlebar(Color.WHITE, "Steel", true);
        Wheels wheels5 = new Wheels(23, false);
        Body body5 = new Body(8,wheels5, TypeOfBody.TRUCK);
        Car car5 = new Car(Color.BLACK, body5, handlebar5, Mark.FORD);
        service.changeCarWithSizeOfWheels(service.readInt(scanner,  "Please enter diameter of wheels: "), car5);




        service.findCar(service.readString(scanner, "Please enter type of body"));
        service.removeCarIfColor(service.readString(scanner, "Please enter color of body"));
        service.updateListOfCar();
        service.changeWheelsToWinter(service.readInt(scanner, "Please enter diameter of wheels from: "), service.readInt(scanner, "Please enter diameter of wheels to: "));
        service.removeCarIfBodyAndWheels(service.readString(scanner, "Please enter color of body"), service.readInt(scanner,
                "Please enter diameter of wheels from: "), service.readInt(scanner, "Please enter diameter of wheels to: "));
        service.getIndexIfBody(service.readString(scanner, "Please enter color of body"));
    }
}
