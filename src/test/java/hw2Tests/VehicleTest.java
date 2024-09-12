package hw2Tests;

import hw2.Car;
import hw2.Motorcycle;
import hw2.Vehicle;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {


    @Test
    void testInstanceOf() {
        Car car = new Car("Ford", "Focus", 2012);
        assertThat(car).isInstanceOf(Vehicle.class);

    }

    @Test
    void testCarWheels(){
        Car car = new Car("Ford", "Focus", 2012);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void testMotorcycleWheels(){
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "F1", 2023);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void testCarTestDrive(){
        Car car = new Car("Ford", "Focus", 2012);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void testMotorcycleTestDrive(){
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "F1", 2023);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void testCarParking(){
        Car car = new Car("Ford", "Focus", 2012);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void testMotorcycleParking(){
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "F1", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }



}
