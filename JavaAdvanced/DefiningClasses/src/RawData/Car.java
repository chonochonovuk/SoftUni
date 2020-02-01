package RawData;

import java.util.List;

public class Car {
    private String model;
    private int engine;
    private String cargo;
    private List<Double> tirePressures;

    public Car(String model, int engine, String cargo, List<Double> tirePressures) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tirePressures = tirePressures;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Double> getTirePressures() {
        return tirePressures;
    }

    public void setTirePressures(List<Double> tirePressures) {
        this.tirePressures = tirePressures;
    }
}
