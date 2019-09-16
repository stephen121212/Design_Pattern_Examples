/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Stephen
 */
public class StrategyPattern {
    public static void main(String [] args){        
    int finalPoints = 1; 
    Points ctx = new Points();
    
    ctx.setPointsMultiplierStrategy(new GoldPointsMultiplier());
    ctx.FindCalculatePoints(finalPoints);
     
    ctx.setPointsMultiplierStrategy(new SilverPointsMultiplier());
    ctx.FindCalculatePoints(finalPoints);
     
    ctx.setPointsMultiplierStrategy(new BronzePointsMultiplier());
    ctx.FindCalculatePoints(finalPoints);
            
    ctx.setPointsMultiplierStrategy(new StandardPointsMultiplier());
    ctx.FindCalculatePoints(finalPoints);
    }
}
