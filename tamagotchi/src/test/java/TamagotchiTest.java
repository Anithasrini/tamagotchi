import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly_lilDragon() {
    Tamagotchi myTamagotchi = new Tamagotchi("lil dragon");
    assertEquals("lil dragon", myTamagotchi.getName());
    // assertEquals(10, myTamagotchi.getSleepLevel());
    // assertEquals(10, myTamagotchi.getActivityLevel());
  }

  @Test
  public void tamagotchi_instantiatesFoodLevelCorrectly_5() {
    Tamagotchi myTamagotchi = new Tamagotchi("5");
    assertEquals(5, myTamagotchi.getFoodLevel());
  }

  @Test
  public void tamagotchi_instantiatesSleepLevelCorrectly_5() {
    Tamagotchi myTamagotchi = new Tamagotchi("5");
    assertEquals(5, myTamagotchi.getSleepLevel());
  }

  @Test
  public void tamagotchi_instantiatesActivityLevelCorrectly_5() {
    Tamagotchi myTamagotchi = new Tamagotchi("5");
    assertEquals(5, myTamagotchi.getActivityLevel());
  }

  @Test
  public void timePasses_foodDecreasesByOne_4() {
    Tamagotchi myTamagotchi = new Tamagotchi("1");
    myTamagotchi.timePasses();
    assertEquals(4, myTamagotchi.getFoodLevel());
  }

}
