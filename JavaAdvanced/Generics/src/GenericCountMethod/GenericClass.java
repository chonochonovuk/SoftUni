package GenericCountMethod;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T extends Comparable<T>> {
    private T t;
    private List<T> tList = new ArrayList<>();

    public void add(T t){
        this.tList.add(t);
    }
    public int compare(T t){
        int i = 0;
        for (T t1 : tList) {
            if (t.compareTo(t1) < 0){
                i++;
            }
        }
        return i;
    }
}
