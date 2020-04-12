package halfLife;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTests {

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullName(){
        Player player = new Player(null,15);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithEmptyName(){
        Player player = new Player(" ",15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeHealth(){
        Player player = new Player("Chono",-15);
    }

    @Test
    public void testConstructorWithValidState(){
        Player player = new Player("Chono",15);
        Assert.assertEquals("Chono",player.getUsername());
        Assert.assertEquals(15,player.getHealth());
    }

    @Test
    public void testCollectionOfGuns(){
        Player player = new Player("Chono",15);
        Assert.assertEquals(0,player.getGuns().size());
    }

    @Test(expected = IllegalStateException.class)
    public void testTakeDamageIfHealthIsLessThanZero(){
        Player player = new Player("Chono",15);
        player.takeDamage(15);
        player.takeDamage(2);
    }

    @Test
    public void testTakeDamage(){
        Player player = new Player("Chono",15);
        player.takeDamage(10);
        Assert.assertEquals(5,player.getHealth());
    }

    @Test(expected = NullPointerException.class)
    public void testAddGunIfItIsNull(){
        Player player = new Player("Chono",15);
        player.addGun(null);
    }

    @Test
    public void testAddGunIfIsAdded(){
        Player player = new Player("Chono",15);
        Gun gun = new Gun("Shotgun",15);
        player.addGun(gun);
        Assert.assertEquals(player.getGun("Shotgun").getBullets(),15);
        Assert.assertEquals(gun.getName(),player.getGun("Shotgun").getName());
    }

    @Test
    public void testRemoveGun(){
        Player player = new Player("Chono",15);
        Gun gun = new Gun("Shotgun",15);
        Gun gun1 = new Gun("Colt",10);
        player.addGun(gun);
        player.addGun(gun1);
        Assert.assertTrue(player.removeGun(gun));
        Assert.assertFalse(player.removeGun(gun));
    }

    @Test
    public void testGetGunMethod(){
        Player player = new Player("Chono",15);
        Gun gun = new Gun("Shotgun",15);
        Gun gun1 = new Gun("Colt",10);
        player.addGun(gun);
        player.addGun(gun1);
        Assert.assertEquals(gun,player.getGun("Shotgun"));
    }
}
