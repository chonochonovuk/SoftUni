package p01_Database;


import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    private Database db;
    @Before
    public void setUp() throws OperationNotSupportedException {
        this.db = new Database(16,15,58,69);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorIfTryToInvokeItWithCapacityLessThanOneOrMoreThan16() throws OperationNotSupportedException {

        Database db = new Database(new Integer[17]);
        Database dbEmpty = new Database();

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddMethodThrowExceptionIfDatabaseIsFull() throws OperationNotSupportedException {
        Database fullDB = new Database(new Integer[16]);
        fullDB.add(55);
    }

    @Test(expected = OperationNotSupportedException.class )
    public void testAddMethodThrowsExceptionIFElementIsNull() throws OperationNotSupportedException {
        db.add(null);
    }

    @Test
    public void testAddMethodIfItIsTheLastElement() throws OperationNotSupportedException {
        Integer toCheck = 555;
        db.add(toCheck);
        Integer[] fromDb = db.getElements();
        assertEquals(toCheck,fromDb[4]);

    }


    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveMethodThrowsExceptionIfTryToRemoveNotExistingElement() throws OperationNotSupportedException {

        Database db = new Database(12);

        db.remove();

        db.remove();



    }

    @Test
    public void testGetElementsMethod(){

        Integer[] elements = {16,15,58,69};
        Integer[] dbElements = db.getElements();

        for (int i = 0; i < elements.length; i++) {
            assertEquals(elements[i],dbElements[i]);
        }

    }



}
