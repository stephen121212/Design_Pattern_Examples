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
public class DecoratorSandwichDemo {
    public static void main(String[]args){
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        
        System.out.print(sandwich.make());
    }
}
