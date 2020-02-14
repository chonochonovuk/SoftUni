package FroggyLake.Frog;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Lake<E> implements Iterable<E> {
    private E[] intTrouble;

    public Lake(E[] intTrouble) {
        E es = intTrouble[0];
        this.intTrouble = (E[]) Array.newInstance(es.getClass(),intTrouble.length);
        for (int i = 0; i < intTrouble.length; i++) {
            this.intTrouble[i] = intTrouble[i];
        }
    }

    public E[] getIntTrouble() {
        return intTrouble;
    }

    @Override
    public Iterator<E> iterator() {
        return new Frog<>(intTrouble);
    }



    public static class Frog<E> implements Iterator<E> {

        private E[] est;
        private int estSize;
        private int steps;


        public Frog(E[] est) {
            this.est = est;
            this.estSize = 0;
            this.steps = 1;
        }


        public boolean checkStep(){
            return this.steps < est.length;
        }

        public E move(){
            int n = this.steps;
            this.steps += 2;
            return this.est[n];
        }

        @Override
        public boolean hasNext() {
            return this.estSize < est.length;
        }

        @Override
        public E next() {
            int curr = this.estSize;
            this.estSize += 2;
            return this.est[curr];
        }
    }
}
