package Google;

public class Children {
    private String childrenName;
    private String childrenBirthday;

    public Children(String childrenName, String childrenBirthday) {
        this.childrenName = childrenName;
        this.childrenBirthday = childrenBirthday;
    }

    public String getChildrenName() {
        return childrenName;
    }

    public String getChildrenBirthday() {
        return childrenBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.childrenName,this.childrenBirthday);
    }
}
