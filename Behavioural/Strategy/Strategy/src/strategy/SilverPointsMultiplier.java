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
public class SilverPointsMultiplier implements PointsMultiplier{
    public int calculateUserPoints(int points) {
      int totalPoints;
      totalPoints = points *3;
      return totalPoints;
    }
}
