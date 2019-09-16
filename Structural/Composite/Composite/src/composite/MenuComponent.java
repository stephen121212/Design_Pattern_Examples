/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephen
 */
public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();
    
    public String getName(){
        return name;
    }
    
    public String getUrl(){
        return url;
    }
    
    public abstract String toString();
    
    String print(MenuComponent menuComponent){
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }
    
    public MenuComponent add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }
    
    public MenuComponent remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }
}
