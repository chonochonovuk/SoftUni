package vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle implements Drive,Refuel,Fuel {
    private double fuelQuantity;
    private double fuelPerKm;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelPerKm,double tankCapacity) {
        this.tankCapacity = tankCapacity;
        this.setFuelQuantity(fuelQuantity);
        this.fuelPerKm = fuelPerKm;
    }

    @Override
    public void fuelAfterDistance(double distance) {
        if ((this.fuelQuantity - (distance*this.fuelPerKm)) < 0){
            throw new IllegalArgumentException(" needs refueling");
        }
       this.fuelQuantity = (this.fuelQuantity - (distance*this.fuelPerKm));
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(distance);
        throw new IllegalArgumentException(String.format(" travelled %s km",formatted));
    }

    public void fuelAfterDistance(double distance,double people) {
        if ((this.fuelQuantity - (distance*(this.fuelPerKm + people))) < 0){
            throw new IllegalArgumentException(" needs refueling");
        }
        this.fuelQuantity = (this.fuelQuantity - (distance*(this.fuelPerKm + people)));
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(distance);
        throw new IllegalArgumentException(String.format(" travelled %s km",formatted));
    }

    @Override
    public void fuelRefill(double litres) {
        if (litres <= 0){
            throw new IllegalStateException("Fuel must be a positive number");
        }
        this.setFuelQuantity(this.fuelQuantity + litres);
    }

    @Override
    public double getFuel() {
        return this.fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity <= 0){
            throw new IllegalStateException("Fuel must be a positive number");
        }
        if (fuelQuantity > this.tankCapacity){
            throw new IllegalStateException("Cannot fit fuel in tank");
        }
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelPerKm(double fuelPerKm) {
        this.fuelPerKm += fuelPerKm;
    }
}
