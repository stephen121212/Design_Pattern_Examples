package strategy;

/**
 *
 * @author Stephen
 */
public class BronzePointsMultiplier implements PointsMultiplier{
  //We implement the abstract method in PointMultiplier for the BronzePointsMultiplier class
  public void calculateUserPoints(int points) {
      //Given the points inputted by the user, we calculate the totalPoints by multiplying the points by 2 and printing the totalPoints to the User
      int totalPoints;
      totalPoints = points *2;
      System.out.println("Bronze Points Multiplier: " + totalPoints);
  }
}
