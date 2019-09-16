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
public class MeatDecorator extends SandwichDecorator {
    
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }
    
    public String make(){
        return customSandwich.make()+ addMeat();
    }
    
    private String addMeat(){
        return " + turkey";
    }
}
