package CarSalesman;

import java.util.Map;

public class Engine {

    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public Engine(String model, String power) {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }

    public Engine(String model,String power,String displacement){
        this(model, power);
        if (Character.isDigit(displacement.charAt(0))){
            this.displacement = displacement;
            this.efficiency = "n/a";
        }else {
            this.displacement = "n/a";
            this.efficiency = displacement;
        }

    }

    public Engine(String model, String power, String displacement, String efficiency) {
        this(model, power, displacement);
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
