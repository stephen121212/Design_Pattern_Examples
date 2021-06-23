package strategy;

/**
 *
 * @author Stephen
 */
public class StandardPointsMultiplier implements PointsMultiplier {
    //We implement the abstract method in PointMultiplier for the StandardPointsMultiplier class
    public void calculateUserPoints(int points) {
      //Given the points inputted by the user, we calculate the totalPoints by multiplying the points by 1 and printing the totalPoints to the User
      int totalPoints;
      totalPoints = points*1;
      System.out.println("Standard Points Multiplier: " + totalPoints);
  }
}
