/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author Stephen
 */
class Movie {
    private String classification;
    private String runtime;
    private String title;
    private String year;
    
    public String getClassification(){
        return classification;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getYear(){
        return year;
    }
    
    public String getRuntime(){
        return runtime;
    }
    
     public void setClassification(String classification){
        this.classification = classification;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setYear(String year){
        this.year = year;
    }
    
    public void setRuntime(String runtime){
        this.runtime = runtime;
    }
}
