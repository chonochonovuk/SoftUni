package CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericList<T extends Comparable<T>> {
    private List<T> tList = new ArrayList<>();
        public void add(T t){
            this.tList.add(t);
        }
    public void remove(int index){
            this.tList.remove(index);
    }
    public boolean contains(T t){
            return this.tList.contains(t);
    }
    public void swap(int a, int b){
            T a1 = this.tList.get(a);
            T b1 = this.tList.get(b);
            this.tList.set(a,b1);
            this.tList.set(b,a1);
    }
    public int countGreaterThan(T e){
            int i = 0;
        for (T t : this.tList) {
            if (e.compareTo(t) < 0){
                i++;
            }
        }
       return i;
    }
    public T getMax(){
        return this.tList.stream().max(Comparator.naturalOrder()).get();
    }
    public T getMin(){
          return this.tList.stream().min(Comparator.naturalOrder()).get();
    }
    public void print(){
        for (T t : this.tList) {
            System.out.println(t);
        }

    }
    public void sort(){
        Collections.sort(this.tList);
    }

}
