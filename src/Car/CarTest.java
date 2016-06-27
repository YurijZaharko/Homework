package Car;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by SCIP on 27.06.2016.
 */
public class CarTest {
    @Test
    public void changeWheels() throws Exception {
        Handlebar handlebar = new Handlebar(Color.BLACK, "Wood", true);
        Wheels wheels = new Wheels(16, true);
        Body body = new Body(4, wheels, TypeOfBody.TRUCK);
        Car car = new Car(Color.BLACK, body, handlebar,Mark.BMW);

        Wheels expected = new Wheels(13, false);
        car.changeWheels(expected);
        Wheels actual = car.getWheel();
        assertEquals(expected, actual);
    }

}