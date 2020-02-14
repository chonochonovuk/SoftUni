package Google;

public class Parents {
    private String parentName;
    private String birthDay;

    public Parents(String parentName, String birthDay) {
        this.parentName = parentName;
        this.birthDay = birthDay;
    }

    public String getParentName() {
        return parentName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.parentName,this.birthDay);
    }
}
