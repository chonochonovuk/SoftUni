package vehicles;

public class Car extends Vehicle{
    public Car(double fuelQuantity, double fuelPerKm,double tankCapacity) {
        super(fuelQuantity, fuelPerKm + 0.9,tankCapacity);
    }

}
