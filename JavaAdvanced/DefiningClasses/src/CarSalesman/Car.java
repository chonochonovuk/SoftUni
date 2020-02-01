package CarSalesman;

import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;

public class Car {
    private String model;
    private String engine;
    private String weight;
    private String color;


    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;

        this.weight = "n/a";
        this.color = "n/a";
    }

    public Car(String model, String engine, String weight) {
        this.model = model;
        this.engine = engine;
        if (Character.isDigit(weight.charAt(0))){
            this.weight = weight;
            this.color = "n/a";
        }else {
            this.weight = "n/a";
            this.color = weight;
        }

    }

    public Car(String model, String engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

}
