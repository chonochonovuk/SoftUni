package ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyArrayList<E extends Comparable<E>> implements Iterable<E> {
    private int size = 0;
    private E[] elementsArray;

//    protected transient int modCount = 0;
//
//    private void fastRemove(Object[] es, int i) {
//        modCount++;
//        final int newSize;
//        if ((newSize = size - 1) > i)
//            System.arraycopy(es, i + 1, es, i, newSize - i);
//        es[size = newSize] = null;
//    }

    public void add(E e){
        size++;
        E[] currentArray = (E[]) Array.newInstance(e.getClass(),size);
        if (size == 1){
            currentArray[size - 1] = e;
            this.elementsArray = currentArray;
            return;
        }

        for (int i = 0; i < this.elementsArray.length; i++) {
            currentArray[i] = this.elementsArray[i];
        }
        currentArray[size - 1] = e;
        this.elementsArray = currentArray;
    }

//    public E remove(int index){
//        Objects.checkIndex(index,this.elementsArray.length);
//        final Object[] es = this.elementsArray;
//
//        @SuppressWarnings("unchecked") E oldValue = (E) es[index];
//        fastRemove(es, index);
//
//        return oldValue;
//    }

    public E remove(int index){

           Objects.checkIndex(index,this.elementsArray.length);
           E e = (E) this.elementsArray[index];
           int newSize = this.elementsArray.length - 1;
           final E[] currentArray = (E[]) Array.newInstance(e.getClass(),newSize);
           int n = 0;
           for (int i = 0; i < currentArray.length; i++) {
               if (n == index){
                   n++;
               }

               currentArray[i] = this.elementsArray[n];
               n++;

           }
           this.elementsArray = currentArray;
           return e;

    }

    public boolean contains(E e){
        for (int i = 0; i < this.elementsArray.length; i++) {
            if (elementsArray[i].equals(e)){
                return true;
            }
        }

        return false;
    }

    public E get(int index){
        if (index < 0 || index >= elementsArray.length){
            return null;
        }

        return elementsArray[index];
    }

    public E[] getAll(){
        return this.elementsArray;
    }
    public void swap(int a, int b){
        if ((a < 0 || a >= this.elementsArray.length) || (b < 0 || b >= this.elementsArray.length)){
            return;
        }
        E a1 = (E) this.elementsArray[a];
        E b1 = (E) this.elementsArray[b];
        this.elementsArray[a] = b1;
        this.elementsArray[b] = a1;
    }


    @Override
    public Iterator<E> iterator(){
        return new MyListIterator<>(this.elementsArray);
    }

}
