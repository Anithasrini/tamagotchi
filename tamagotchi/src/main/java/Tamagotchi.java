public class Tamagotchi {
  // public static final int MAX_FOOD = 10;
  private String mName;
  private int mFoodLevel = 5;
  private int mSleepLevel = 5;
  private int mActivityLevel = 5;

  public Tamagotchi(String name) {
    mName = name;
  }

  public String getName() {
    return mName;
  }

  public int getFoodLevel() {
    return mFoodLevel;
  }
  public int getSleepLevel() {
    return mSleepLevel;
  }

  public int getActivityLevel() {
    return mActivityLevel;
  }

  public void timePasses() {
    timePasses(1);
  }

  public void timePasses(int time) {
    mFoodLevel -= time;
  }

}
