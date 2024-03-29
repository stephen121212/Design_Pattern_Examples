package Interceptor;

import java.util.ArrayList;

public class Dispatcher implements Interceptor{

	ArrayList<Interceptor> Interceptors = new ArrayList<Interceptor>();
	
	private static Dispatcher thisDispatcher;
	
	private Dispatcher() {
		
	}
	
	public void preRequest(Context context) {
		Interceptor myInterceptor = Interceptors.get(Interceptors.size()-1);
		System.out.println(context.getUserName()+"\t"+context.getTime()+"\tLogin ");
		myInterceptor.preRequest(context);
		
		
	}

	public void postRequest(Context context) {
		Interceptor myInterceptor = Interceptors.get(Interceptors.size()-1);
		System.out.println(context.getUserName()+"\t"+context.getTime()+"\tLogout ");
		myInterceptor.postRequest(context);		
	}

	public void registerDispatcher(Interceptor interceptor) {
		Interceptors.add(interceptor);
		System.out.println("An interceptor is registered! ");
	}
	
	public void removerDispatcher(Interceptor interceptor) {
		Interceptors.remove(interceptor);
		System.out.println("The interceptor is removed! ");
	}
	
	
	public static Dispatcher getInstanceOfDispatcher() {
		if(thisDispatcher == null)
			return new Dispatcher();
		else
			return thisDispatcher;
	}
	
}
