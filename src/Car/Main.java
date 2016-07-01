package Car;

import java.util.*;

/**
 * Created by SCIP on 16.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> linkedList = new LinkedList<>();
        Set<Car> linkedHashSet = new LinkedHashSet<>();
        Service service = new Service(linkedList, scanner);
        Service serviceSet =new Service(linkedHashSet, scanner);

        service.updateListOfCar();


        service.findCar(service.readInt("Please enter diameter of wheels: "));
        service.findCar(service.readInt("Please enter diameter of wheels: "), service.readString("Please enter color "));
        service.changeInRedCars(new Handlebar(Color.GREEN, "Plastic", false));
        service.changeSizeOfWheels();

        Handlebar handlebar5 = new Handlebar(Color.WHITE, "Steel", true);
        Wheels wheels5 = new Wheels(23, false);
        Body body5 = new Body(8,wheels5, TypeOfBody.TRUCK);
        Car car5 = new Car(Color.BLACK, body5, handlebar5, Mark.FORD);
        service.changeCarWithSizeOfWheels(service.readInt("Please enter diameter of wheels: "), car5);




        service.findCar(service.readString("Please enter type of body"));
        service.removeCarIfColor(service.readString("Please enter color of body"));
        service.updateListOfCar();
        service.changeWheelsToWinter(service.readInt("Please enter diameter of wheels from: "), service.readInt("Please enter diameter of wheels to: "));
        service.getIndexIfBody(service.readString("Please enter color of body"));

        serviceSet.updateSetOfCar();
        serviceSet.changeWheelsInSet(service.readString("Please enter type of body" ) , service.readInt("Please enter diameter of wheels"), service.readString("Please enter type of wheels"));
        serviceSet.removeCarIfWheelSet(service.readInt("Please enter diameter of wheels from: "), service.readInt("Please enter diameter of wheels to: "));
        service.findByWheelsSet( service.readString("Please enter type of wheels"), service.readInt("Please enter diameter of wheels from: "), service.readInt("Please enter diameter of wheels to: "));
        scanner.close();
    }
}
