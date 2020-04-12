package aquarium;

import org.junit.Assert;
import org.junit.Test;

public class AquariumTests {

    @Test(expected = NullPointerException.class)
    public void testConstructorWithEmptyName(){
       Aquarium aquariumEmpty = new Aquarium(" ",5);
   }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNull(){
        Aquarium aquarium = new Aquarium(null,10);
    }

   @Test(expected = IllegalArgumentException.class)
   public void testConstructorWithNegativeCapacity(){
     Aquarium aquariumEmpty = new Aquarium("Sea Life",-5);

   }

   @Test
   public void testConstructorWithValidStates(){
       Aquarium aquariumEmpty = new Aquarium("Sea Life",5);
       String name = "Sea Life";
       int capacity = 5;
       Assert.assertEquals(name,aquariumEmpty.getName());
       Assert.assertEquals(capacity,aquariumEmpty.getCapacity());
   }

    @Test
    public void testGetName(){
       Aquarium aquariumEmpty = new Aquarium("Sea Life",5);
       Assert.assertEquals("Sea Life",aquariumEmpty.getName());
   }

    @Test
    public void testCapacity(){
       Aquarium aquariumEmpty = new Aquarium("Sea Life",5);
       Assert.assertEquals(5,aquariumEmpty.getCapacity());
   }


   @Test
    public void testGetCount(){
       Aquarium aquariumEmpty = new Aquarium("Sea Life",5);
       Fish fish = new Fish("AquaFish");
       aquariumEmpty.add(fish);
       Assert.assertEquals(1,aquariumEmpty.getCount());
   }

   @Test(expected = IllegalArgumentException.class)
    public void testAddFishIfFull(){
       Aquarium aquariumEmpty = new Aquarium("Sea Life",2);
       aquariumEmpty.add(new Fish("Nemo"));
       aquariumEmpty.add(new Fish("Fishy"));
       aquariumEmpty.add(new Fish("Zack"));
   }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveFishIfNull(){
        Aquarium aquariumEmpty = new Aquarium("Sea Life",2);
        aquariumEmpty.add(new Fish("Nemo"));
        aquariumEmpty.add(new Fish("Fishy"));
        aquariumEmpty.add(new Fish("Zack"));
        aquariumEmpty.remove("Zeno");
    }

    @Test
    public void testRemoveRightFish(){
        Aquarium aquariumEmpty = new Aquarium("Sea Life",3);
        aquariumEmpty.add(new Fish("Nemo"));
        aquariumEmpty.add(new Fish("Fishy"));
        aquariumEmpty.add(new Fish("Zack"));
        aquariumEmpty.remove("Zack");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSellFishIfNull(){
        Aquarium aquariumEmpty = new Aquarium("Sea Life",3);
        aquariumEmpty.add(new Fish("Nemo"));
        aquariumEmpty.add(new Fish("Fishy"));
        aquariumEmpty.add(new Fish("Zack"));
        aquariumEmpty.sellFish("Fishies");
    }

    @Test
    public void testSellRightFish(){
        Aquarium aquariumEmpty = new Aquarium("Sea Life",3);
        aquariumEmpty.add(new Fish("Nemo"));
        aquariumEmpty.add(new Fish("Fishy"));
        aquariumEmpty.add(new Fish("Zack"));
        Fish fish = aquariumEmpty.sellFish("Zack");
        Assert.assertFalse(fish.isAvailable());
    }

    @Test
    public void testReport(){
        Aquarium aquariumEmpty = new Aquarium("Sea Life",3);
        aquariumEmpty.add(new Fish("Nemo"));
        aquariumEmpty.add(new Fish("Fishy"));
        aquariumEmpty.add(new Fish("Zack"));
        String matcher = String.format("Fish available at %s: %s", aquariumEmpty.getName(), "Nemo, Fishy, Zack");
        Assert.assertEquals(matcher,aquariumEmpty.report());
    }








}

