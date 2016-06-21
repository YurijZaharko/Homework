package Car;

import java.util.List;
import java.util.Scanner;

/**
 * Created by SCIP on 21.06.2016.
 */
public class Service {
    List<Car> list;
    public Service(List<Car> list){
        this.list = list;
    }
    void addCarToList(Car car){
        list.add(car);
    }

    void findCar(int wheel){
        for (Car car: list) {
            if (car.getSizeOfWheels() == wheel){
                System.out.println("Car with wheels " + wheel + " is: ");
                System.out.println(car);
            }
        }
        System.out.println();
    }

    void findCar(int wheel, Color color){
        for (Car car: list) {
            if (car.getSizeOfWheels() == wheel&& car.getColorOfCar().equals(color)){
                System.out.println("Car with wheels " + wheel + " and color " + color + " is: ");
                System.out.println(car);
            }
        }
        System.out.println();
    }

    public void changeInRedCars(Handlebar handlebar) {
        for (Car car: list) {
            if (car.getColorOfCar().equals(Color.RED)){
                car.setHandlebar(handlebar);
                System.out.println("In thees car we change a handlebar ");
                System.out.println(car);
            }
        }
        System.out.println();
    }

    public void changeSizeOfWheels() {
        for (Car car: list) {
            if (car.isButtonInHandlebar()){
                car.setSizeOfWheels(2 * car.getSizeOfWheels());
                System.out.println("In thees car we change size of wheels");
                System.out.println(car);
            }
        }
        System.out.println();
    }

    public void changeCarWithSizeOfWheels(int size, Car newCar) {
        for (int i = 0; i < list.size(); i++) {
            Car car = list.get(i);
            if (car.getSizeOfWheels() < size) {
                list.set(i, newCar);
                System.out.println("Old car: " + car);
                System.out.println("New car: "  + list.get(i));
            }
        }
        System.out.println();
    }

    public int read(Scanner sc, String text) {
        System.out.println(text);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        }
        return 0;
    }
}
