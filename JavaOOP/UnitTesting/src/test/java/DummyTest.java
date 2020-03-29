import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void test_Dummy_Loses_Health_If_Attacked(){
        // Arrange
        Dummy dum = new Dummy(10,9);

        Axe ax = new Axe(5,5);

        // Act

        // dum.takeAttack(ax.getAttackPoints());

        // or

        ax.attack(dum);

        // Assert

        Assert.assertEquals(5,dum.getHealth());
    }


    @Test(expected = IllegalStateException.class)
    public void test_Dead_Dummy_Throws_Exception_If_Attacked(){
        // Arrange
        Dummy dum = new Dummy(0,9);

        Axe ax = new Axe(5,5);

        // Act

        dum.takeAttack(ax.getAttackPoints());

        // Assert

        // Throws exception
    }

    @Test(expected = IllegalStateException.class)
    public void test_Dead_Dummy_Throws_Exception_If_Try_To_GetExperience(){
        // Arrange
        Dummy dum = new Dummy(3,9);


        // Act

        dum.giveExperience();

        // Assert

        // Throws exception
    }

}