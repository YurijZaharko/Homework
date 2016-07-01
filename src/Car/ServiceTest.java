package Car;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;

import static org.junit.Assert.*;


/**
 * Created by SCIP on 26.06.2016.
 */
public class ServiceTest {

    @org.junit.Test
    public void updateListOfCar() throws Exception {
        List<Car> carList = new LinkedList<>();
        Service service = new Service(carList);
        service.updateListOfCar();
        int actual = carList.size();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void findCar() throws Exception {
        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(16, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Wood", true);
        Wheels wheels1 = new Wheels(15, true);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car1 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);

        List<Car> carList = new LinkedList<>();
        carList.add(car);
        carList.add(car1);
        Service service = new Service(carList);
        assertFalse(service.findCar(15).isEmpty());
        assertNull(service.findCar(19));
    }

    @org.junit.Test
    public void findCar1() throws Exception {
        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(16, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car expected = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Wood", true);
        Wheels wheels1 = new Wheels(15, true);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car expected1 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);

        List<Car> carList = new LinkedList<>();
        carList.add(expected);
        carList.add(expected1);
        Service service = new Service(carList);

        assertNull("15, GREEN", service.findCar(15, "GREEN"));
        assertNull("16, RED", service.findCar(16, "RED"));
        assertNull("19, BLACK", service.findCar(19, "BLACK"));

        ArrayList<Car> carArrayList = service.findCar(15, "RED");
        for (Car car:carArrayList) {
            assertEquals(expected1.getWheel(), car.getWheel());
            assertEquals(expected1.getColorOfCar(),car.getColorOfCar());
        }

        ArrayList<Car> carArrayList1 = service.findCar(16, "BLACK");
        for (Car car:carArrayList1) {
            assertEquals(expected.getWheel(), car.getWheel());
            assertEquals(expected.getColorOfCar(),car.getColorOfCar());
        }
    }

    @org.junit.Test
    public void changeInRedCars() throws Exception {
        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(16, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car1 = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Wood", true);
        Wheels wheels1 = new Wheels(15, true);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car2 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);

        Handlebar expected = new Handlebar(Color.GREEN, "Plastic", false);

        List<Car> carList = new LinkedList<>();
        carList.add(car1);
        carList.add(car2);
        Service service = new Service(carList);

        service.changeInRedCars(expected);
        for (Car car :carList) {
            if(car.getColorOfCar().equals(Color.RED)){
                Handlebar actual = car.getHandlebar();
                assertEquals(expected, actual);
            }else {
                Handlebar actual = car.getHandlebar();
                assertNotEquals(expected, actual);
            }
        }
    }

    @org.junit.Test
    public void changeSizeOfWheels() throws Exception {
        int expected = 32;
        int expected1 = 15;
        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(16, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car1 = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Wood", false);
        Wheels wheels1 = new Wheels(15, true);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car2 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);

        List<Car> carList = new LinkedList<>();
        carList.add(car1);
        carList.add(car2);
        Service service = new Service(carList);

        service.changeSizeOfWheels();
        for (Car car :carList) {
            if(car.isButtonInHandlebar()){
                int actual = car.getSizeOfWheels();
                assertEquals(expected, actual);
            }else {
                int actual1 = car.getSizeOfWheels();
                assertEquals(expected1, actual1);
            }
        }
    }

    @org.junit.Test
    public void changeCarWithSizeOfWheels() throws Exception {
        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(17, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car1 = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels1 = new Wheels(15, false);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car2 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);

        List<Car> carList = new LinkedList<>();
        carList.add(car1);
        carList.add(car2);
        Service service = new Service(carList);

        Handlebar handlebar2 = new Handlebar(Color.BLACK, "Wood", false);
        Wheels wheels2 = new Wheels(25, true);
        Body body2 = new Body(4,wheels2, TypeOfBody.CAR);
        Car expected = new Car(Color.YELLOW, body2, handlebar2, Mark.OPEL);

        service.changeCarWithSizeOfWheels(16, expected);
        assertTrue("16, expected",carList.contains(expected));
        assertTrue("15, car1",carList.contains(car1));
    }

    @org.junit.Test
    public void findCar2() throws Exception {
        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(16, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car1 = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Wood", false);
        Wheels wheels1 = new Wheels(15, true);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car2 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);

        List<Car> carList = new LinkedList<>();
        carList.add(car1);
        carList.add(car2);
        Service service = new Service(carList);

        TypeOfBody expected = TypeOfBody.TRUCK;
        ArrayList<Car> temp = service.findCar("TRUCK");
        for (Car car : temp) {
            TypeOfBody actual = car.getTypeOfBody();
            assertEquals(expected, actual);
        }
    }

    @org.junit.Test
    public void removeCarIfColor() throws Exception {
        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(17, false);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car1 = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels1 = new Wheels(15, false);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car2 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);

        List<Car> carList = new LinkedList<>();
        carList.add(car1);
        carList.add(car2);
        Service service = new Service(carList);

        Color expect = Color.BLACK;
        service.removeCarIfColor("RED");
        for (Car car:carList) {
            Color actual = car.getColorOfCar();
            assertEquals(expect, actual);
        }
    }

    @org.junit.Test
    public void changeWheelsToWinter() throws Exception {
        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(17, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car1 = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        Handlebar handlebar1 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels1 = new Wheels(15, true);
        Body body1 = new Body(4,wheels1, TypeOfBody.CAR);
        Car car2 = new Car(Color.RED, body1, handlebar1, Mark.HONDA);

        List<Car> carList = new LinkedList<>();
        carList.add(car1);
        carList.add(car2);
        Service service = new Service(carList);
        int from = 14;
        int to = 16;
        service.changeWheelsToWinter(from, to);


        for (Car car:carList) {
            if (car.getSizeOfWheels() > from && car.getSizeOfWheels() < to ){
                assertFalse(car.isSummerRubber());
            } else {
                assertTrue(car.isSummerRubber());
            }
        }
    }

    @org.junit.Test
    public void removeCarIfBodyAndWheels() throws Exception {
        Handlebar handlebar1 = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels1 = new Wheels(27, true);
        Body body1 = new Body(4, wheels1, TypeOfBody.TRUCK);
        Car car1 = new Car(Color.BLACK, body1, handlebar1,Mark.BMW);

        Handlebar handlebar2 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels2 = new Wheels(15, true);
        Body body2 = new Body(4,wheels2, TypeOfBody.CAR);
        Car car2 = new Car(Color.RED, body2, handlebar2, Mark.HONDA);

        Handlebar handlebar3 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels3 = new Wheels(18, true);
        Body body3 = new Body(4,wheels3, TypeOfBody.CAR);
        Car car3 = new Car(Color.GREEN, body3, handlebar3, Mark.HONDA);

        Handlebar handlebar4 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels4 = new Wheels(15, true);
        Body body4 = new Body(4,wheels4, TypeOfBody.CAR);
        Car car4 = new Car(Color.GREEN, body4, handlebar4, Mark.HONDA);

        List<Car> actual = new ArrayList<>();
        actual.add(car1);
        actual.add(car2);
        actual.add(car3);
        actual.add(car4);
        Service service = new Service(actual);
        String color = "GREEN";
        int from = 14;
        int to = 16;
        service.removeCarIfBodyAndWheels(color, from, to);

        List<Car> expected = new ArrayList<>();
        expected.add(car1);
        expected.add(car2);
        expected.add(car3);

        assertEquals(expected.size(), actual.size());
        assertTrue(expected.containsAll(actual));
    }

    @org.junit.Test
    public void getIndexIfBody() throws Exception {
        Handlebar handlebar1 = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels1 = new Wheels(27, true);
        Body body1 = new Body(4, wheels1, TypeOfBody.TRUCK);
        Car car1 = new Car(Color.BLACK, body1, handlebar1,Mark.BMW);

        Handlebar handlebar2 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels2 = new Wheels(15, true);
        Body body2 = new Body(4,wheels2, TypeOfBody.CAR);
        Car car2 = new Car(Color.RED, body2, handlebar2, Mark.HONDA);

        List<Car> carList = new LinkedList<>();
        carList.add(car1);
        carList.add(car2);
        Service service = new Service(carList);

        int expectedInt = 0;
        ArrayList<Integer> integerList = service.getIndexIfBody("TRUCK");
        for (Integer index : integerList) {
            int actualInt = index;
            assertEquals(expectedInt, actualInt);
        }

        Handlebar handlebar3 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels3 = new Wheels(18, true);
        Body body3 = new Body(4,wheels3, TypeOfBody.CAR);
        Car car3 = new Car(Color.GREEN, body3, handlebar3, Mark.HONDA);

        Handlebar handlebar4 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels4 = new Wheels(15, true);
        Body body4 = new Body(4,wheels4, TypeOfBody.CAR);
        Car car4 = new Car(Color.GREEN, body4, handlebar4, Mark.HONDA);

        List<Car> carList2 = new LinkedList<>();
        carList2.add(car3);
        carList2.add(car4);
        Service service2 = new Service(carList2);
        assertNull(service2.getIndexIfBody("TRUCK"));
    }

    @Test
    public void changeWheelsInSet() throws Exception {
        Handlebar handlebar3 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels3 = new Wheels(18, false);
        Body body3 = new Body(4,wheels3, TypeOfBody.CAR);
        Car car3 = new Car(Color.BLACK, body3, handlebar3, Mark.HONDA);

        Handlebar handlebar4 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels4 = new Wheels(15, false);
        Body body4 = new Body(4,wheels4, TypeOfBody.TRUCK);
        Car car4 = new Car(Color.GREEN, body4, handlebar4, Mark.HONDA);
        Set<Car> carSet = new  LinkedHashSet<>();
        carSet.add(car3);
        carSet.add(car4);

        Service service = new Service(carSet);
        service.changeWheelsInSet("CAR", 18, "True");
        boolean expected = true;
        boolean actual = car3.isSummerRubber();
        assertEquals(expected, actual);
        assertEquals(false, car4.isSummerRubber());
    }

    @Test
    public void removeCarIfWheelSet() throws Exception {
        Handlebar handlebar3 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels3 = new Wheels(18, false);
        Body body3 = new Body(4,wheels3, TypeOfBody.CAR);
        Car car3 = new Car(Color.BLACK, body3, handlebar3, Mark.HONDA);

        Handlebar handlebar4 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels4 = new Wheels(15, false);
        Body body4 = new Body(4,wheels4, TypeOfBody.TRUCK);
        Car car4 = new Car(Color.GREEN, body4, handlebar4, Mark.HONDA);
        Set<Car> carSet = new  LinkedHashSet<>();
        carSet.add(car3);
        carSet.add(car4);
        Service service = new Service(carSet);

        service.removeCarIfWheelSet(14, 16);
        assertEquals(1, carSet.size());
        assertTrue(carSet.contains(car3));
        assertFalse(carSet.contains(car4));
    }

    @Test
    public void findByWheelsSet() throws Exception {
        Handlebar handlebar3 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels3 = new Wheels(18, false);
        Body body3 = new Body(4,wheels3, TypeOfBody.CAR);
        Car car3 = new Car(Color.BLACK, body3, handlebar3, Mark.HONDA);

        Handlebar handlebar4 = new Handlebar(Color.BLUE, "Steel", false);
        Wheels wheels4 = new Wheels(15, true);
        Body body4 = new Body(4,wheels4, TypeOfBody.TRUCK);
        Car car4 = new Car(Color.GREEN, body4, handlebar4, Mark.HONDA);
        Set<Car> carSet = new  LinkedHashSet<>();
        carSet.add(car3);
        carSet.add(car4);
        Service service = new Service(carSet);

        LinkedHashSet<Car> actual = service.findByWheelsSet("false", 17, 19);
        LinkedHashSet<Car> expected = new  LinkedHashSet<Car>();
        expected.add(car3);
        assertEquals(actual, expected);
    }

}