package singleton;

/**
 *
 * @author Stephen
 */
public class SingletonPatternDemo {
     public static void main(String[] args) {
      //Creating a Test Method to test the SingletonObject in order to show that the two objects reference the same object in memory
      
      //Get the uniqueInstance from the SingletonObject class
      SingletonObject object = SingletonObject.getInstance();

      //Call the showMessage method linked to the Object (Which calls the toString method of the object to show the memory location of the SingletonObject)
      object.showMessage();
      
      //Get the uniqueInstance from the SingletonObject class
      SingletonObject object2 = SingletonObject.getInstance();
      
      //Call the showMessage method linked to the Object (Which calls the toString method of the object to show the memory location of the SingletonObject)
      object2.showMessage();
   }
}
