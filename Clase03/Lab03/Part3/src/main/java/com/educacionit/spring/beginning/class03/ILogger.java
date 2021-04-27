

package com.educacionit.spring.beginning.class03;



import java.util.function.Supplier;



public interface ILogger {

	
	
	void info (Supplier<String> message);
	
	
	void warn (Supplier<String> message);
	
	
	void debug (Supplier<String> message);
	
	
	void error (Supplier<String> message);
	
	
	void error (Supplier<String> message, Throwable t);
}