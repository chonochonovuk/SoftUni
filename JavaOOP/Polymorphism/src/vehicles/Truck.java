package vehicles;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelPerKm,double tankCapacity) {
        super(fuelQuantity, fuelPerKm + 1.6,tankCapacity);
    }

    @Override
    public void fuelRefill(double litres) {
        super.fuelRefill(litres*0.95);
    }
}
