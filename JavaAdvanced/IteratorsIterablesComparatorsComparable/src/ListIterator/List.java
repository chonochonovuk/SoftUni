package ListIterator;

import java.util.Iterator;

public class List<E> implements Iterable<E>{

    private E[] elements;

    public List(E... es){
        this.elements = es;
    }


    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(elements);
    }

    public static class ListIterator<E> implements Iterator<E>{

        int size;
        private E[] current;

        public ListIterator(E... elements){
            this.current = elements;
            this.size = 0;
        }

        public void print(){
            if (this.current.length == 0){
                System.out.println("Invalid Operation!");
                return;
            }
            System.out.println(this.current[size]);
        }

        public boolean check(){
            return this.size < current.length - 1;
        }

        @Override
        public boolean hasNext() {
            return this.size < current.length;
        }

        @Override
        public E next() {
            return this.current[size++];
        }

    }
}
