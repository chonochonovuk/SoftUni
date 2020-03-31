package p03_IteratorTest;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {
    private ListIterator iterator;

    @Before
    public void setUp() throws OperationNotSupportedException {
        this.iterator = new ListIterator("A","B","C","D");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testListIteratorConstructorShouldNotAcceptNullElement() throws OperationNotSupportedException {
        String[] elements = null;
      ListIterator nullIterator = new ListIterator(elements);
    }


    @Test
    public void testMoveMethod() {
        assertTrue(iterator.move());
        assertTrue(iterator.move());
        assertTrue(iterator.move());
        assertFalse(iterator.move());
    }

    @Test
    public void testHasNext() {
        assertTrue(iterator.hasNext());
        iterator.move();
        assertTrue(iterator.hasNext());
        iterator.move();
        assertTrue(iterator.hasNext());
        iterator.move();
        assertFalse(iterator.hasNext());
    }

    @Test(expected = IllegalStateException.class)
    public void testEmptyListPrint() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator();
        listIterator.print();

    }
    @Test
    public void testPrintElementIfItIsCorrect(){
        String[] arrayCheck = {"A","B","C","D"};

        for (int i = 0;iterator.hasNext(); iterator.move()) {
           assertEquals( arrayCheck[i++],iterator.print());
        }

    }
}