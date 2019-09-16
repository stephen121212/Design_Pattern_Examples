/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Stephen
 */
public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();
    
    public Registry(){
        loadItems();
    }
    
    public Item createItem(String type){
        Item item = null;
        
        try{
            item = (Item)(items.get(type)).clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        
        
        return item;
    }
    
    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);
        
        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(24.99);
        book.setNumberOfPages(335);
        items.put("Book", book);
    }
}
