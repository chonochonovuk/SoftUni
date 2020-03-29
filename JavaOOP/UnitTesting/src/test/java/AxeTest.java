import org.junit.Assert;
import org.junit.Test;



public class AxeTest {
    @Test
    public void testWeaponAttackLosesDurability(){
        // Arrange

        Axe a = new Axe(10,10);

        Dummy dum = new Dummy(10,10);

        // Act

        a.attack(dum);

        // Assert

        Assert.assertEquals(9,a.getDurabilityPoints());

    }

    @Test(expected = IllegalStateException.class)
    public void testBrokenWeaponCannotAttack(){
        // Arrange

        Axe a = new Axe(10,0);

        Dummy dum = new Dummy(10,10);

        // Act

        a.attack(dum);

        // Assert

        // Exception is thrown
    }
}