package blueOrigin;

import org.junit.Assert;
import org.junit.Test;

public class SpaceshipTests {

    @Test(expected = NullPointerException.class)
    public void testConstructorWithEmptyName(){
        new Spaceship(" ",2);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullName(){
        new Spaceship(null,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithCapacityLessThanZero(){
        new Spaceship("Arms",-2);
    }

    @Test
    public void testConstructorWithValidState(){
       Spaceship spaceship = new Spaceship("Arms",2);
       Assert.assertEquals(spaceship.getName(),"Arms");
       Assert.assertEquals(spaceship.getCapacity(),2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfTryToAddAstronautsMoreThanCapacity(){
        Spaceship spaceship = new Spaceship("Arms",2);
        spaceship.add(new Astronaut("Atre",22.15));
        spaceship.add(new Astronaut("Cert",25.15));
        spaceship.add(new Astronaut("Derttre",12.15));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfTryToAddSameAstronautsMoreThanOnce(){
        Spaceship spaceship = new Spaceship("Arms",2);
        spaceship.add(new Astronaut("Atre",22.15));
        spaceship.add(new Astronaut("Atre",22.15));

    }

    @Test
    public void testRemoveAnAstronauts(){
        Spaceship spaceship = new Spaceship("Arms",2);
        spaceship.add(new Astronaut("Atre",22.15));
        spaceship.add(new Astronaut("Cert",25.15));
        Assert.assertTrue(spaceship.remove("Atre"));
        Assert.assertFalse(spaceship.remove("Atre"));
    }

    @Test
    public void testGetCount(){
        Spaceship spaceship = new Spaceship("Arms",2);
        spaceship.add(new Astronaut("Atre",22.15));
        spaceship.add(new Astronaut("Cert",25.15));
        Assert.assertEquals(2,spaceship.getCount());
    }
}
