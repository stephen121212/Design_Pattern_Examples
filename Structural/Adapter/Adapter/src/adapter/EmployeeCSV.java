/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.StringTokenizer;

/**
 *
 * @author Stephen
 */
class EmployeeCSV {
    private int id;
    private String firstname;
    private String lastname;
    private String emailAddress;
    
    public EmployeeCSV(String values){
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if(tokenizer.hasMoreElements()){
            id = Integer.parseInt(tokenizer.nextToken());
        }
        
        if(tokenizer.hasMoreElements()){
            firstname = tokenizer.nextToken();
        }
        
        if(tokenizer.hasMoreElements()){
            lastname = tokenizer.nextToken();
        }
        
        if(tokenizer.hasMoreElements()){
            emailAddress = tokenizer.nextToken();
        }
    }
    
    public int getID(){
        return id;
    }
    
    public String getFirstname(){
        return firstname;
    }
     
    public String getLastname(){
        return lastname;
    }
      
    public String getEmailAddress(){
        return emailAddress;
    }
}
