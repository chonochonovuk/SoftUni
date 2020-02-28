package TrafficLights;

public enum Light {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");
    private String lightChange;
    private Light(String lightChange){
        this.lightChange = lightChange;
    }

    public String getLightChange() {
        return lightChange;
    }
}
