import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly_lilDragon() {
    Tamagotchi myTamagotchi = new Tamagotchi("lil dragon");
    assertEquals("lil dragon", myTamagotchi.getName());
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

  @Test
  public void timePasses_sleepDecreasesByOne_4() {
    Tamagotchi myTamagotchi = new Tamagotchi("1");
    myTamagotchi.timePasses();
    assertEquals(4, myTamagotchi.getSleepLevel());
  }

  @Test
  public void timePasses_activityDecreasesByOne_4() {
    Tamagotchi myTamagotchi = new Tamagotchi("1");
    myTamagotchi.timePasses();
    assertEquals(4, myTamagotchi.getActivityLevel());
  }

  @Test
  public void isAlive_foodLevelAbove0_true() {
    Tamagotchi myTamagotchi = new Tamagotchi("1");
    assertEquals(true, myTamagotchi.isAlive());
  }

  @Test
  public void feedMeal_foodIncreasesByOne_6() {
    Tamagotchi myTamagotchi = new Tamagotchi("1");
    assertEquals(6, myTamagotchi.getFoodLevel());
  }



  // @Test
  // public void isFoodLevelFull_foodLevelAt10_true() {
  //   Tamagotchi myTamagotchi = new Tamagotchi("10");
  //   assertEquals(true, myTamagotchi.isFullFoodLevel());
  // }
  //
  // @Test
  // public void isFoodLevelFull_foodLevelAt10_false() {
  //   Tamagotchi myTamagotchi = new Tamagotchi("9");
  //   assertEquals(false, myTamagotchi.isFullFoodLevel());
  // }


}
