package Car;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by SCIP on 21.06.2016.
 */
public class Service {
    private List<Car> carList;
    private Set<Car> carSet;
    Scanner scanner;

    Service(List<Car> carList){
        this.carList = carList;
    }

    Service(List<Car> carList, Scanner scan){
        this.carList = carList;
        this.scanner = scan;
    }

    Service(Set<Car> carSet){
        this.carSet = carSet;
    }

    Service(Set<Car> carSet, Scanner scan){
        this.carSet = carSet;
        this.scanner = scan;
    }

    private void addCarToList(Car car){
        carList.add(car);
    }

    private void addCarToSet(Car car){
        carSet.add(car);
    }

    void updateListOfCar() {
        carList.clear();

        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(16, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car = new Car(Color.BLACK, body, handlebar,Mark.BMW);
        addCarToList(car);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Wood", true);
        Wheels wheels1 = new Wheels(15, true);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car1 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);
        addCarToList(car1);

        Handlebar handlebar2 = new Handlebar(Color.WHITE, "Wood", false);
        Wheels wheels2 = new Wheels(19, false);
        Body body2 = new Body(4,wheels2, TypeOfBody.CAR);
        Car car2 = new Car(Color.BLUE, body2, handlebar2, Mark.OPEL);
        addCarToList(car2);

        Handlebar handlebar3 = new Handlebar(Color.GREEN, "Wood", false);
        Wheels wheels3 = new Wheels(13, false);
        Body body3 = new Body(4,wheels3, TypeOfBody.CAR);
        Car car3 = new Car(Color.YELLOW, body3, handlebar3, Mark.BMW);
        addCarToList(car3);

        Handlebar handlebar4 = new Handlebar(Color.WHITE, "Steel", true);
        Wheels wheels4 = new Wheels(23, false);
        Body body4 = new Body(8,wheels4, TypeOfBody.TRUCK);
        Car car4 = new Car(Color.BLACK, body4, handlebar4, Mark.FORD);
        addCarToList(car4);
    }

    void updateSetOfCar(){
        carSet.clear();

        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(16, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car = new Car(Color.BLACK, body, handlebar,Mark.BMW);
        addCarToSet(car);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Wood", true);
        Wheels wheels1 = new Wheels(15, true);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car1 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);
        addCarToSet(car1);

        Handlebar handlebar2 = new Handlebar(Color.WHITE, "Wood", false);
        Wheels wheels2 = new Wheels(19, false);
        Body body2 = new Body(4,wheels2, TypeOfBody.CAR);
        Car car2 = new Car(Color.BLUE, body2, handlebar2, Mark.OPEL);
        addCarToSet(car2);

        Handlebar handlebar3 = new Handlebar(Color.GREEN, "Wood", false);
        Wheels wheels3 = new Wheels(13, false);
        Body body3 = new Body(4,wheels3, TypeOfBody.CAR);
        Car car3 = new Car(Color.YELLOW, body3, handlebar3, Mark.BMW);
        addCarToSet(car3);

        Handlebar handlebar4 = new Handlebar(Color.WHITE, "Steel", true);
        Wheels wheels4 = new Wheels(23, false);
        Body body4 = new Body(8,wheels4, TypeOfBody.TRUCK);
        Car car4 = new Car(Color.BLACK, body4, handlebar4, Mark.FORD);
        addCarToSet(car4);
    }

    ArrayList<Car> findCar(int wheel){
        ArrayList<Car> temp = new ArrayList<Car>();
        for (Car car: carList) {
            if (car.getSizeOfWheels() == wheel){
                temp.add(car);
                System.out.println("Car with wheels " + wheel + " is: ");
                System.out.println(car);

            }
        }
        System.out.println();
        if (temp.isEmpty()){
            return null;
        }
        return temp;
    }

    ArrayList<Car> findCar(int wheel, String col){
        Color color = Color.valueOf(col);
        ArrayList<Car> temp = new ArrayList<Car>();
        for (Car car: carList) {
            if (car.getSizeOfWheels() == wheel&& car.getColorOfCar().equals(color)){
                temp.add(car);
                System.out.println("Car with wheels " + wheel + " and color " + color + " is: ");
                System.out.println(car);
            }
        }
        System.out.println();
        if (temp.isEmpty()){
            return null;
        }
        return temp;
    }

    void changeInRedCars(Handlebar handlebar) {
        for (Car car: carList) {
            if (car.getColorOfCar().equals(Color.RED)){
                car.setHandlebar(handlebar);
                System.out.println("In thees car we change a handlebar ");
                System.out.println(car);
            }
        }
        System.out.println();
    }

    void changeSizeOfWheels() {
        for (Car car: carList) {
            if (car.isButtonInHandlebar()){
                car.setSizeOfWheels(2 * car.getSizeOfWheels());
                System.out.println("In thees car we change size of wheels");
                System.out.println(car);
            }
        }
        System.out.println();
    }

    void changeCarWithSizeOfWheels(int size, Car newCar) {
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            if (car.getSizeOfWheels() < size) {
                carList.set(i, newCar);
                System.out.println("Old car: " + car);
                System.out.println("New car: "  + carList.get(i));
            }
        }
        System.out.println();
    }

    int readInt(String text) {
        System.out.println(text);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return 0;
    }

    String readString(String text) {
        System.out.println(text);
        return scanner.next();


    }

    ArrayList<Car> findCar(String readString) {
        ArrayList<Car> tempList = new ArrayList<Car>();
        TypeOfBody typeOfBody = TypeOfBody.valueOf(readString);
        Iterator<Car> iterator = carList.iterator();
        while (iterator.hasNext()){
            Car temp = iterator.next();
            if (temp.getTypeOfBody().equals(typeOfBody)){
                tempList.add(temp);
                System.out.println("Such car has type of body " + typeOfBody);
                System.out.println(temp);
            }
        }
        if(tempList.isEmpty()){
            return null;
        }
        return tempList;
    }

    void removeCarIfColor(String readString) {
        Color color = Color.valueOf(readString);
        Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()){
            Car car = carIterator.next();
            if (car.getColorOfCar().equals(color)){
                System.out.println("Such car with color " + color + " will be removed!");
                System.out.println(car);
                carIterator.remove();
            }
        }
        System.out.println();
    }

    void changeWheelsToWinter(int readIntFrom, int readIntTo) {
        Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()){
            Car car = carIterator.next();
            if(car.getSizeOfWheels() > readIntFrom && car.getSizeOfWheels() < readIntTo){
                System.out.println("Change wheels in car " + car);
                car.setSummerRubber(false);
            }
        }
    }

    void removeCarIfBodyAndWheels(String bodyColor, int sizeFrom, int sizeTo) {
        Color color = Color.valueOf(bodyColor);
        Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()){
            Car car = carIterator.next();
            if(car.getSizeOfWheels() > sizeFrom && car.getSizeOfWheels() < sizeTo && car.getColorOfCar().equals(color)){
                System.out.println("Such car with color " + color + " and size " + car.getSizeOfWheels() +" will be removed!");
                System.out.println(car);
                carIterator.remove();
            }
        }
        System.out.println();
    }

    ArrayList<Integer> getIndexIfBody(String readString) {
        ArrayList<Integer> carIndex = new ArrayList<>();
        TypeOfBody typeOfBody = TypeOfBody.valueOf(readString);
        ListIterator<Car> iterator = carList.listIterator();

        while (iterator.hasNext()){
            Car temp = iterator.next();
            if (temp.getTypeOfBody().equals(typeOfBody)){
                carIndex.add(iterator.previousIndex());
                System.out.println("Such car has type of body " + typeOfBody + " with index " + iterator.previousIndex());
                System.out.println(temp);
            }
        }
        System.out.println(carIndex);
        if(carIndex.isEmpty()){
            return null;
        }
        return carIndex;
    }

    void changeWheelsInSet(String type, int size, String isSummer){
        TypeOfBody typeOfBody = TypeOfBody.valueOf(type);
        Boolean isSummerRubber = Boolean.valueOf(isSummer);
        carSet.stream().filter(car -> car.getTypeOfBody().equals(typeOfBody) && car.getSizeOfWheels() == size).forEach(car -> car.setSummerRubber(isSummerRubber));
    }


    void removeCarIfWheelSet(int from, int to) {
        carSet.removeIf(car -> car.getSizeOfWheels() >= from && car.getSizeOfWheels() <= to);
    }


    LinkedHashSet<Car> findByWheelsSet(String isSumm, int from, int to) {
        Boolean isSummer = Boolean.valueOf(isSumm);
        LinkedHashSet<Car> carLinkedHashSet = new LinkedHashSet<Car>();

        Iterator<Car> iterator = carSet.iterator();
        while (iterator.hasNext()){
            Car temp = iterator.next();
            if (temp.isSummerRubber() == isSummer && temp.getSizeOfWheels() >= from && temp.getSizeOfWheels() <= to){
                carLinkedHashSet.add(temp);
            }
        }


        /**
         * carSet.stream().filter(car -> car.isSummerRubber() == isSummerRubber && car.getSizeOfWheels() >= from && car.getSizeOfWheels() <= to).collect(Collectors.toSet());
         */
        return carLinkedHashSet;
    }
}
