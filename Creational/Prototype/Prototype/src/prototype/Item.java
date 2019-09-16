/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Stephen
 */
public abstract class Item implements Cloneable {
    private String title;
    private double price;
    private String url;
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getTitle(){
        return title;
    }
     
    public String getUrl(){
        return url;
    }
    
    public void setUrl(String url){
        this.url = url;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
     
    public void setPrice(double price){
        this.price = price;
    }
}
