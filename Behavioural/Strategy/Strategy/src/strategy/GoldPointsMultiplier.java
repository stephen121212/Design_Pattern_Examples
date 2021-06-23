package strategy;

/**
 *
 * @author Stephen
 */
public class GoldPointsMultiplier implements PointsMultiplier {
  //We implement the abstract method in PointMultiplier for the GoldPointsMultiplier class
  public void calculateUserPoints(int points) {
      //Given the points inputted by the user, we calculate the totalPoints by multiplying the points by 4 and printing the totalPoints to the User
      int totalPoints;
      totalPoints = points *4;
      System.out.println("Gold Points Multiplier: " + totalPoints);
  }
}