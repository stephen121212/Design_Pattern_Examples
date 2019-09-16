package Interceptor;

public class ConcreteFrameWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dispatcher myDispatcher = Dispatcher.getInstanceOfDispatcher();  // create dispatcher singleton
		
		Application userLog = new Application();
		
		
		userLog.LogIn(new Context(System.nanoTime(),"user 1" ), myDispatcher);
		userLog.LogIn(new Context(System.nanoTime(),"user 2" ), myDispatcher);
		
		
		userLog.LogOut(new Context(System.nanoTime(),"user 1" ), myDispatcher);

		userLog.LogOut(new Context(System.nanoTime(),"user 2" ), myDispatcher);
		
	}

}
