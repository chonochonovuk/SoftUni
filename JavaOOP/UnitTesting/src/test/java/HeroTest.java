import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void attackGainExperienceIfTargetIsDead(){

        Weapon weaponMock = Mockito.mock(Weapon.class);
        Target targetMock = Mockito.mock(Target.class);

        Mockito.when(targetMock.isDead()).thenReturn(true);

        Mockito.when(targetMock.giveExperience()).thenReturn(10);

        Hero hero = new Hero("Chono",5,new Axe(10,10));

    }

    @Test
    public void testLootingDeadTarget(){
        Axe axeMock = Mockito.mock(Axe.class);
        Target targetMock = Mockito.mock(Target.class);

        Mockito.when(targetMock.isDead()).thenReturn(true);

        Mockito.when(targetMock.getLoot()).thenReturn(axeMock);

        Mockito.when(targetMock.giveExperience()).thenReturn(3);

        Hero hero = new Hero("Chono",0,axeMock);

        hero.attack(targetMock);

        Assert.assertEquals(hero.getInventory().size(),1);
        Assert.assertTrue(hero.getInventory().contains(axeMock));
        Assert.assertEquals(3,hero.getExperience());



    }

}