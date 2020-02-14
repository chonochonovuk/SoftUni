package MyOwnStack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class ChonoStack<E> implements Iterable<E> {

    private E[] myStack;
    private int sizeCurrent;

    public ChonoStack(E[] myStack) {
        this.myStack = myStack;
        this.sizeCurrent = this.myStack.length;
    }

    public ChonoStack(){
        this.myStack = null;
        this.sizeCurrent = 0;
    }

    public E[] getMyStack() {
        return myStack;
    }

    public void pop(){
        if (myStack.length == 0){
            System.out.println("No elements");
            return;
        }
        this.myStack = Arrays.copyOfRange(this.myStack,0, this.myStack.length - 1);
        this.sizeCurrent = this.myStack.length;
    }

    public void push(E element){
        E[] addTop = (E[]) Array.newInstance(element.getClass(), sizeCurrent + 1);

        for (int i = 0; i < sizeCurrent; i++) {
            addTop[i] = this.myStack[i];
        }
        addTop[sizeCurrent] = element;
        this.myStack = addTop;
        this.sizeCurrent = this.myStack.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new ChonoStackIterator<>(this.getMyStack());
    }

    public static class ChonoStackIterator<E> implements Iterator<E>{

        private E[] stack;
        private int size;

        public ChonoStackIterator(E[] es) {
            this.stack = es;
            this.size = es.length;
        }

        @Override
        public boolean hasNext() {
            return this.size > 0;
        }

        @Override
        public E next() {
            size--;
            return this.stack[size];
        }
    }
}
