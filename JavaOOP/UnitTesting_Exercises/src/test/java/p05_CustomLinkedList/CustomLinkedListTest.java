package p05_CustomLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {

    private CustomLinkedList<String> customLinkedList;

    @Before
    public void setUp(){
        this.customLinkedList = new CustomLinkedList<>("Alice");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testConstructor(){
       this.customLinkedList.get(0);
    }

    @Test
    public void testAdd() {
        this.customLinkedList.add("Chono");
        assertEquals("Chono",this.customLinkedList.get(0));
        this.customLinkedList.add("Jackie");
        assertEquals("Jackie",this.customLinkedList.get(1));
    }

    @Test
    public void testGetIFIndexDoesExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        this.customLinkedList.get(0);
        this.customLinkedList.get(1);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testGetIFIndexDoesNotExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        this.customLinkedList.get(13);
        this.customLinkedList.get(-2);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSetIFIndexDoesNotExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        this.customLinkedList.set(2,"Alana");
        this.customLinkedList.set(-1,"Sliva");
    }

    @Test
    public void testSetIFIndexDoesExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        this.customLinkedList.set(0,"Alana");
        this.customLinkedList.set(1,"Sliva");
    }


    @Test
    public void testRemoveAtIFIndexDoesExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        this.customLinkedList.removeAt(1);
        this.customLinkedList.removeAt(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAtIFIndexDoesNotExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        //Shall remove first last index ,because when remove size--
        this.customLinkedList.removeAt(0);
        //Now there is no such index
        this.customLinkedList.removeAt(1);
    }

    @Test
    public void testRemoveIFElementDoesExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        this.customLinkedList.remove("Chono");
        this.customLinkedList.remove("Cheeki");
    }

    @Test
    public void testRemoveIFElementDoesNotExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        this.customLinkedList.remove("Chono");
        //Now there is no such index, but the list does not throw exception
        int c = this.customLinkedList.remove("Chono");
        // but it return int = -1
        assertEquals(-1,c);
    }

    @Test
    public void testIndexOfIFElementDoesExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        int first = this.customLinkedList.indexOf("Chono");
        int second = this.customLinkedList.indexOf("Cheeki");
        assertEquals(0,first);
        assertEquals(1,second);
    }

    @Test
    public void testIndexOfIFElementDoesNotExist() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        int first = this.customLinkedList.indexOf("Chono");
        int second = this.customLinkedList.indexOf("Cheeki");
        assertEquals(0,first);
        assertEquals(1,second);
        // Return -1 if index does not exist
        assertEquals(-1,this.customLinkedList.indexOf("Jackie"));
    }

    @Test
    public void testContainsWithElements() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        assertTrue(this.customLinkedList.contains("Chono"));
    }

    @Test
    public void testContainsWithNotSuchElement() {
        this.customLinkedList.add("Chono");
        this.customLinkedList.add("Cheeki");
        assertTrue(this.customLinkedList.contains("Chono"));
        assertFalse(this.customLinkedList.contains("Jackie"));
    }
}