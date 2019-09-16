package Interceptor;

public interface Interceptor {

	void preRequest(Context context);
	void postRequest(Context context);
	
	
}
