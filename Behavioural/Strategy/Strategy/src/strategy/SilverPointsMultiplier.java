package strategy;

/**
 *
 * @author Stephen
 */
public class SilverPointsMultiplier implements PointsMultiplier{
    //We implement the abstract method in PointMultiplier for the SilverPointsMultiplier class
    public void calculateUserPoints(int points) {
      //Given the points inputted by the user, we calculate the totalPoints by multiplying the points by 3 and printing the totalPoints to the User
      int totalPoints;
      totalPoints = points*3;
      System.out.println("Silver Points Multiplier: " + totalPoints);
    }
}
