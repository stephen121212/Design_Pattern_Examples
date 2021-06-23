package strategy;

/**
 *
 * @author Stephen
 */

//PointsMultiplier is an interface that all PointMultipliers must implement 
//All the PointMultipliers must be able to implement the calculateUserPoints() method in order to print out the new points that were calculated given the user's class and the points the user currently has
public interface PointsMultiplier {
  public void calculateUserPoints(int points);
}