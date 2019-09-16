/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interatorpattern;
import java.util.Iterator;  
/**
 *
 * @author Stephen
 */
public class InteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();
        
        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");
        
        Iterator<String> bikeIterator = repo.iterator();
        
        while(bikeIterator.hasNext()){
            System.out.println(bikeIterator.next());
        }
        
        for(String bike: repo)
        {
            System.out.println(bike);
        }
    }
}
