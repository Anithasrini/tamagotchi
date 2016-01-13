import java.util.ArrayList;

public class Tamagotchi {
  public static final int MAX_FOOD = 10;
  public static final int MAX_SLEEP = 10;
  public static final int MAX_ACTIVITY = 10;
  private String mName;
  private int mFoodLevel;
  private int mSleepLevel;
  private int mActivityLevel;
  private boolean mIsAlive;

  public Tamagotchi(String name) {
    mName = name;
    mFoodLevel = 5;
    mSleepLevel = 5;
    mActivityLevel = 5;
    mIsAlive = true;
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
    mSleepLevel -= time;
    mActivityLevel -= time;
  }

  public boolean isAlive() {
    return mIsAlive;
  }

  public void feedMeal() {
      while (!foodFull()) {
        mFoodLevel += 1;
      }
  }

  public void giveNap() {
      mSleepLevel += 1;
  }

  public void playFetch() {
      mActivityLevel += 1;
  }

  public void levelsStatus() {
    mFoodLevel--;
    mSleepLevel--;
    mActivityLevel--;
    if ( (mFoodLevel >= 0) || (mSleepLevel >=0) || (mActivityLevel >= 0) ) {
      mIsAlive = true;
    } else {
      mIsAlive = false;
    }
  }

  public boolean foodFull() {
    return mFoodLevel == MAX_FOOD;
  }

  public boolean sleepFull() {
    return mSleepLevel == MAX_SLEEP;
  }

  public boolean activityFull() {
    return mActivityLevel == MAX_ACTIVITY;
  }



/*This is to check the different levels of food, sleep, and activity to see if the tamagotchi is still alive*/

  // public ArrayList<Integer> levelsStatus() {
  //   ArrayList<Integer> status = new ArrayList<Integer>();
  //     status.add(mFoodLevel);
  //     status.add(mSleepLevel);
  //     status.add(mActivityLevel);
  //     return status;
  // }
  //
  // public boolean isAlive() {
  //   ArrayList<Integer> status = this.levelsStatus();
  //   for (Integer i : status) {
  //     if (i >= 1) {
  //       return true;
  //     }
  //   }
  //   return false;
  // }


}
