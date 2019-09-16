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
public abstract class SandwichDecorator implements Sandwich{
    protected Sandwich customSandwich;
    
    public SandwichDecorator(Sandwich customSandwich){
        this.customSandwich = customSandwich;
    }
    
    @Override
    public String make() {
        return customSandwich.make();
    } 
}
