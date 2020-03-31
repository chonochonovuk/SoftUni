package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {
    private Person[] people;
    @Before
    public void setUp() {
      this.people = new Person[]{
              new Person(556, "Jackie"),
              new Person(468, "Katie"),
              new Person(263, "Tania"),
              new Person(756, "Joanna")
      };
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowExceptionIfEmptyOrMoreThan16() throws OperationNotSupportedException {
        Database dbEmpty = new Database();
        Database fullDb = new Database(new Person[17]);
    }


    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullPersonInDatabase() throws OperationNotSupportedException {
       Database dbWithPeople = new Database(this.people);
       Person nulls = null;
       dbWithPeople.add(nulls);
    }

    @Test
    public void testAddPersonInDatabaseIsLast() throws OperationNotSupportedException {
        Database dbWithPeople = new Database(this.people);
        Person nulls = new Person(69,"Ivie");
        dbWithPeople.add(nulls);
        Person[] addPersonCheckIfLast = dbWithPeople.getElements();
        assertEquals(nulls.getId(),addPersonCheckIfLast[4].getId());
        assertEquals(nulls.getUsername(),addPersonCheckIfLast[4].getUsername());
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveIfNotPresent() throws OperationNotSupportedException {
        Database dbWithPeople = new Database(this.people);
        dbWithPeople.remove();
        dbWithPeople.remove();
        dbWithPeople.remove();
        dbWithPeople.remove();
        dbWithPeople.remove();
    }

    @Test
    public void testGetElementsMethod() throws OperationNotSupportedException {
        Database dbWithPeople = new Database(this.people);
        Person[] personAll = this.people;
        Person[] fromDb = dbWithPeople.getElements();
        assertArrayEquals(fromDb,personAll);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testMethodFindByUsernameIfNameIsNull() throws OperationNotSupportedException {
        Database dbWithPeople = new Database(this.people);
        Person nulls = new Person(69,null);
        dbWithPeople.add(nulls);
        dbWithPeople.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testMethodFindByUsernameIfNameMoreThanOneWithSameNameAreFoundOrNameDoesNotExist() throws OperationNotSupportedException {
        Database dbWithPeople = new Database(this.people);
        Person nulls = new Person(69,"Katie");
        dbWithPeople.add(nulls);
        dbWithPeople.findByUsername("Katie");
        dbWithPeople.findByUsername("Kat");

    }

    @Test(expected = OperationNotSupportedException.class)
    public void testMethodFindByIdIfNameMoreThanOneWithSameIdAreFoundOrIdDoesNotExist() throws OperationNotSupportedException {
        Database dbWithPeople = new Database(this.people);
        Person nulls = new Person(556,"Katy");
        dbWithPeople.add(nulls);
        dbWithPeople.findById(556);
        dbWithPeople.findById(57);

    }

}