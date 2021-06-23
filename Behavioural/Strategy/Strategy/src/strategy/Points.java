package strategy;

/**
 *
 * @author Stephen
 */
public class Points {
  //We create a private instance of the PointsMultiplier class that cannot be accessed outside the class definition
  private PointsMultiplier multiplier;
  
  //We have a setPointsMultiplier method in order to dynamically change the PointsMultiplier at runtime
  public void setPointsMultiplierStrategy(PointsMultiplier multiplier) {
    this.multiplier = multiplier;
  }
  
  //We then use the Strategy Pattern to call the current's multiplier calculateUserPoints() method
  public void FindCalculatePoints(int points) {
    multiplier.calculateUserPoints(points);
  }
}
