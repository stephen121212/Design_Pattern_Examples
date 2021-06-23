package strategy;

/**
 *
 * @author Stephen
 */
public class StrategyPattern {
    //The main method is used to implement the Strategy Methods
    public static void main(String [] args){        
    //We get the points that the user has
    int finalPoints = 10; 
    
    //We create a Points class that will act as the Strategy Pattern
    Points ctx = new Points();
    
    //Dynamically set which Points Multiplier is first set to the GoldPointsMultiplier
    ctx.setPointsMultiplierStrategy(new GoldPointsMultiplier());
    //Call the FindCalculatePoints of that PointMultiplier with the UserPoints
    ctx.FindCalculatePoints(finalPoints);
     
    //Dynamically set which Points Multiplier is first set to the SilverPointsMultiplier
    ctx.setPointsMultiplierStrategy(new SilverPointsMultiplier());
    //Call the FindCalculatePoints of that PointMultiplier with the UserPoints
    ctx.FindCalculatePoints(finalPoints);
     
    //Dynamically set which Points Multiplier is first set to the BronzePointsMultiplier
    ctx.setPointsMultiplierStrategy(new BronzePointsMultiplier());
    //Call the FindCalculatePoints of that PointMultiplier with the UserPoints
    ctx.FindCalculatePoints(finalPoints);
            
    //Dynamically set which Points Multiplier is first set to the StandardPointsMultiplier
    ctx.setPointsMultiplierStrategy(new StandardPointsMultiplier());
    //Call the FindCalculatePoints of that PointMultiplier with the UserPoints
    ctx.FindCalculatePoints(finalPoints);
    }
}
