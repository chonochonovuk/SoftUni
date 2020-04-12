package carTrip;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    private Car car;
    @Before
    public void setUp(){
        this.car = new Car("BMW",40.50,28.59,6.6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetModelIfNullOrEmptyStringIsGiven(){
        this.car.setModel("");
        String nulls = null;
        this.car.setModel(nulls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetFuelAmountIfMoreThanCapacity(){
        this.car.setFuelAmount(40.65);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetFuelConsumptionPerKmIfZeroORNegative(){
        this.car.setFuelConsumptionPerKm(0);
        this.car.setFuelConsumptionPerKm(-5);

    }

    @Test(expected = IllegalStateException.class)
    public void testDriveMethodIfTripNeedMoreFuelThanAvailable(){
        this.car.drive(7.15);

    }


    @Test(expected = IllegalStateException.class)
    public void testRefuelMethodIfMoreTankCapacity(){
        this.car.refuel(17.15);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testCarConstructor(){
        Car newCar = new Car("",15.5,7.5,5.5);
        Car newCar2 = new Car("Audi",15.5,7.5,0);
        Car newCar3 = new Car("Audi",15.5,17.5,4.12);

    }

    @Test
    public void testDriveMethod(){
        String tripSuccessful = this.car.drive(2.15);
        assertEquals("Have a nice trip",tripSuccessful);
    }

    @Test
    public void testRefuelMethod(){
        this.car.refuel(1.41);
        Double fuelAmount = this.car.getFuelAmount();
        Double expected = 30.00;
        assertEquals(expected,fuelAmount);
    }


    @Test
    public void testGetModel(){
        String model = this.car.getModel();
        assertEquals("BMW",model);
    }



}