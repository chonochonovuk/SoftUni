package p04_BubbleSortTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {
    private int[] arrayToCompare;
    private int[] toSort;

    @Before
    public void setUp(){
        this.arrayToCompare = new int[]{-20,-18,1,17,26};
        this.toSort = new int[]{26,-18,1,-20,17};
    }

    @Test
    public void testBubbleSort() {
       Bubble.sort(this.toSort);

       assertArrayEquals(this.arrayToCompare,this.toSort);


    }
}