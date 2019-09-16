/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.Iterator;

/**
 *
 * @author Stephen
 */
class Menu extends MenuComponent {

    public Menu(String name, String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
       menuComponents.add(menuComponent);
       return menuComponent;
    }
    
    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
       menuComponents.remove(menuComponent);
       return menuComponent;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(); //Builder Pattern
        
        builder.append(print(this));
        
        Iterator<MenuComponent> itr = menuComponents.iterator();
        while(itr.hasNext()){
            MenuComponent menuComponent = itr.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }
}
