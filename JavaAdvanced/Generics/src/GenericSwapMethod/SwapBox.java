package GenericSwapMethod;

import java.util.ArrayList;
import java.util.List;

public class SwapBox<T> {
    private T t;
    private List<T> list = new ArrayList<>();

    public void add(T t){
        this.list.add(t);
    }

    public void swap(int a,int b){
        T swapA = this.list.get(a);
        T swapB = this.list.get(b);
        this.list.set(a,swapB);
        this.list.set(b,swapA);
    }

    public void printList(){
        for (T t1 : this.list) {
            System.out.println(t1.getClass().getName() + ": " + t1.toString());
        }

    }

}
