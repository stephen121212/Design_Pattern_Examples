/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Stephen
 */
public class Memento {

    public static void main(String[] args) {
        CareTaker caretaker = new CareTaker();
        
        Employee emp = new Employee();
        
        emp.setName("John Wick");
        emp.setAddress("111 Main Street");
        emp.setPhone("888-555-1212");
        
        System.out.println("Employee before save:                 " + emp);
        
        caretaker.save(emp);
        
        emp.setPhone("444-555-6666");
        
        caretaker.save(emp);
        
        System.out.println("Employee after changed phone number save: " + emp);
    
        emp.setPhone("333-999-6666");
        
        caretaker.revert(emp);
        
        System.out.println("Reverts to last save point: " + emp);
         
        caretaker.revert(emp);
         
        System.out.println("Reverted to original: " + emp);
    }   
}
