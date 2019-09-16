/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Stephen
 */
public class Catalog {
    private Map<String, Item> items = new HashMap<String, Item>();
    
    public Item lookup(String itemName){
        if(!items.containsKey(itemName)){
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }
    
    public int totalItemsMode(){
        return items.size();
    }
}
