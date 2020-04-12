package heroRepository;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroRepositoryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testAddUniqueHero(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.add(new Hero("Jack",3,new Item(10,15,20)));
        heroRepository.add(new Hero("Jack",3,new Item(10,15,20)));
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveIfHeroIsNull(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.add(new Hero("Jack",3,new Item(10,15,20)));
        heroRepository.remove("John");
    }

    @Test
    public void testRemoveIfHeroExist(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.add(new Hero("Jack",3,new Item(10,15,20)));
        heroRepository.remove("Jack");
        Assert.assertEquals(0,heroRepository.getCount());
    }


    @Test(expected = NullPointerException.class)
    public void testGetHeroWithHighestStrengthIfNull(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.getHeroWithHighestStrength();
    }

    @Test
    public void testGetHeroWithHighestStrength(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.add(new Hero("Jack",3,new Item(10,18,23)));
        heroRepository.add(new Hero("Allan",3,new Item(15,15,20)));
        Assert.assertEquals(new Hero("Allan",3,new Item(15,15,20)),heroRepository.getHeroWithHighestStrength());
    }

    @Test(expected = NullPointerException.class)
    public void testGetHeroWithHighestAgilityIfNull(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.getHeroWithHighestAgility();
    }

    @Test
    public void testGetHeroWithHighestAgility(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.add(new Hero("Jack",3,new Item(16,15,20)));
        heroRepository.add(new Hero("Allan",3,new Item(15,20,12)));
        Assert.assertEquals(new Hero("Allan",3,new Item(15,20,22)),heroRepository.getHeroWithHighestAgility());
    }

    @Test(expected = NullPointerException.class)
    public void testGetHeroWithHighestIntelligenceIfNull(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.getHeroWithHighestIntelligence();
    }

    @Test
    public void testGetHeroWithHighestIntelligence(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.add(new Hero("Jack",3,new Item(16,15,20)));
        heroRepository.add(new Hero("Allan",3,new Item(15,12,24)));
        Assert.assertEquals(new Hero("Allan",3,new Item(15,12,24)),heroRepository.getHeroWithHighestIntelligence());
    }


    @Test
    public void testGetCount(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.add(new Hero("Jack",3,new Item(10,15,20)));
        heroRepository.add(new Hero("Jin",8,new Item(13,12,22)));
        Assert.assertEquals(2,heroRepository.getCount());
    }

}