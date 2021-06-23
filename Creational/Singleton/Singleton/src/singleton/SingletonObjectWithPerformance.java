//If you are worried about performance with the SingletonObject, we should implement double-locking to reduce the effects of synchronization

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

   //Return the Singleton instance to the user when called (Static so all instances of the class can access this method)
   //If the instance is null, we then synchronize the class in order to ensure that the no other threads can access the SingletonObject class at the same time (We only synchronize once at the start as after the instance is created, we do not need to worry about synchronization anymore)
   //We then check again if the instance is still null, just to ensure that no other methods have synchronized in that time and that we still need to create an instance
   public static SingletonObject getInstance(){
     if(uniqueInstance == null){
	synchronized (SingletonObject.class) {
	  if (uniqueInstance == null) {
		uniqueInstance = new SingletonObject();
	  }
	}
     }

     return uniqueInstance;
   }

   //Method that the uniqueInstance contains in order to show the user that both instances are the same in the Test Class (Calls the toString method in order to find where the Object references in memory)
   public void showMessage(){
      System.out.println(uniqueInstance.toString());
   }
}
