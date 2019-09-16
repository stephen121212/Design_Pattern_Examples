/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Stephen
 */
public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
