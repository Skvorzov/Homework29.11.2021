import com.skvortsov.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void shouldCreateCar() {
    Car car = new Car(20, 9);
    double fuel = car.getFuel();
    double consumption = car.getConsumption();

    Assertions.assertEquals(fuel, 20);
    Assertions.assertEquals(consumption, 9);
    }

    @Test
    void testCanDrive() {
        Car car = new Car(10, 5);
        boolean testDrive = car.canDrive();
        Assertions.assertTrue(testDrive);
    }

    @Test
    void testCantDrive() {
        Car car = new Car(0, 5);
        boolean testDrive = car.canDrive();
        Assertions.assertFalse(testDrive);
        }

    @Test
    void testGetDistance() {
        Car car = new Car(20, 7);
        double distance = car.getDistance();
        Assertions.assertEquals(distance, car.getFuel() / car.getConsumption() * 100);
    }
}