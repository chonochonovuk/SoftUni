package GenericBox;

public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }


    @Override
    public String toString() {
        return "" + t.getClass().getName() +
                ": " + t;
    }
}
