/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Stephen
 */
public class LunchOrder {
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;

        private String meat;
        
        public Builder(){
            
        }
        
        public LunchOrder build()
        {
            return new LunchOrder(this);
        }
        
        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }
        
        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        
        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }
         
        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }
    
    private final String bread;
    private final String condiments;
    private final String dressing;
    
    private final String meat;
    
    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }
    
    public String getBread(){
        return this.bread;
    }
    
    public String getCondiments(){
        return this.condiments;
    }
    
    public String getDressing(){
        return this.dressing;
    }
    
    public String getMeat(){
        return this.meat;
    }
}
