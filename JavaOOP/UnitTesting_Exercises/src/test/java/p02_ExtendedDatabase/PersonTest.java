package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    private Person testSubject;

    @Before
    public void setUp() throws Exception {
        this.testSubject = new Person(505,"Alice");
    }

    @Test
    public void testConstructor(){
        assertEquals(new Person(505,"Alice"),testSubject);
    }

    @Test
    public void testGetId() {
        assertEquals(505,testSubject.getId());

    }

    @Test
    public void testGetUsername() {
      assertEquals("Alice",testSubject.getUsername());
    }

    @Test
    public void testEqualsPersons() {
        Object equal = new Person(505,"Alice");

        assertTrue(testSubject.equals(equal));

    }

    @Test
    public void testHashCode() {
        Object equal = new Person(505,"Alice");

        assertTrue(testSubject.hashCode() == equal.hashCode());
    }
}