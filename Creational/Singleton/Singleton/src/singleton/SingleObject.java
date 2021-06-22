/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Stephen
 */
public class SingletonObject {
   //Create an object of SingletonObject that is private therefore classes outside this class definition cannot access it and static so all instance of the class can access this element
   //If you do not care about overheads or performance better to use an eager instantiation approach as therefore you will not need to worry about Threads potentially creating seperate Singleton Instances
   //The JVM guarentees that the instance will be created before any thread accesses the static uniqueInstance variable
   private static SingletonObject uniqueInstance = new SingletonObject();

   //Make the constructor private so that this constructor cannot be called outside this class definiton and new instances cannot be instantiated 
   private SingletonObject(){}

   //Return the Singleton instance to the user when called (Static so all instances of the class can access this method)
   public static SingletonObject getInstance(){
      return uniqueInstance;
   }

   //Method that the uniqueInstance contains in order to show the user that both instances are the same in the Test Class (Calls the toString method in order to find where the Object references in memory)
   public void showMessage(){
      System.out.println(uniqueInstance.toString());
   }
}
