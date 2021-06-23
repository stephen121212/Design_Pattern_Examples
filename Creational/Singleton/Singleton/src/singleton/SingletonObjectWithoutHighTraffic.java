//If you are not worried about performance when using synchronization and if the code is not used in a high-traffic application, synchronization of the getInstance() method should be used

package singleton;
/**
 *
 * @author Stephen
 */
public class SingletonObject {
   //Create an object of SingletonObject that is private therefore classes outside this class definition cannot access it and static so all instance of the class can access this element
   //Ensure that the instance is volatile to ensure that the class is thread safe, meaning that multiple threads can use a method and instance of the classes at the same time without any problem
   private volatile static SingletonObject uniqueInstance;

   //Make the constructor private so that this constructor cannot be called outside this class definiton and new instances cannot be instantiated 
   private SingletonObject(){}

   //Return the Singleton instance to the user when called (Static so all instances of the class can access this method), we synchronize the method in order to not allow multiple threads access the method
   //If the instance is null, we create an instance of the SingletonObject
   public static synchronized SingletonObject getInstance(){
     if(uniqueInstance == null){
	uniqueInstance = new SingletonObject();
     }

     return uniqueInstance;
   }

   //Method that the uniqueInstance contains in order to show the user that both instances are the same in the Test Class (Calls the toString method in order to find where the Object references in memory)
   public void showMessage(){
      System.out.println(uniqueInstance.toString());
   }
}
