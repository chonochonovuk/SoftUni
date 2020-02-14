package ArrayList;

import java.util.Iterator;

public class MyListIterator<E> implements Iterator<E> {
    private E[] es;
    private int nextIndex;

    public MyListIterator(E[] es){
        this.es = es;
        this.nextIndex = 0;

    }
    @Override
    public boolean hasNext() {
        return nextIndex < es.length;
    }

    @Override
    public E next() {
        return es[nextIndex++];
    }
}
