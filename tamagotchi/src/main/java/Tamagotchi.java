import java.util.ArrayList;

public class Tamagotchi {
  // public static final int MAX_FOOD = 10;
  private String mName;
  private int mFoodLevel = 5;
  private int mSleepLevel = 5;
  private int mActivityLevel = 5;
  private ArrayList<Integer> status = new ArrayList<Integer>();

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

  public ArrayList<Integer> levelsStatus() {
      status.add(mFoodLevel);
      status.add(mSleepLevel);
      status.add(mActivityLevel);
      return status;
  }

  public boolean isAlive() {
    boolean alive = false;
    ArrayList<Integer> status = new ArrayList<Integer>();
    for (Integer i : status) {
      if (i >= 0) {
        alive = true;
      }
    }
    return alive;
  }


}
