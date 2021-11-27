import com.skvortsov.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void shouldCreateCar() {
    Car car = new Car(20, 9, 2021, 6, 11);
    double fuel = car.getFuel();
    double consumption = car.getConsumption();
    int year = car.getInspectionDate().getYear();
    int month = car.getInspectionDate().getMonthValue();
    int day = car.getInspectionDate().getDayOfMonth();
    Assertions.assertEquals(fuel, 20);
    Assertions.assertEquals(consumption, 9);
    Assertions.assertEquals(year, 2021);
    Assertions.assertEquals(month, 6);
    Assertions.assertEquals(day, 11);
    }

    @Test
    void testCanDrive() {
        Car car = new Car(10, 5, 2021, 6, 11);
        boolean testDrive = car.canDrive();
        Assertions.assertTrue(testDrive);
    }

    @Test
    void testCantDrive() {
        Car car = new Car(0, 5, 2021, 6, 11);
        boolean testDrive = car.canDrive();
        Assertions.assertFalse(testDrive);
        }

    @Test
    void testGetDistance() {
        Car car = new Car(20, 7, 2021, 6, 11);
        double distance = car.getDistance();
        Assertions.assertEquals(distance, car.getFuel() / car.getConsumption() * 100);
    }

    @Test
    void testInspectionTime() {
        Car car = new Car(20, 5, 2021, 6, 11);
        boolean trueInspectionTime = car.getInspectionCheck();
        Assertions.assertTrue(trueInspectionTime);
    }

    @Test
    void testNoInspectionTime() {
        Car car = new Car(20, 5, 2017, 6, 11);
        boolean falseInspectionTime = car.getInspectionCheck();
        Assertions.assertFalse(falseInspectionTime);
    }
}