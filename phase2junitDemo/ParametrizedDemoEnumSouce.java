package com.app.junitdemo;



import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParametrizedDemoEnumSouce {
	
	// If the code is returning a value which is stored in Enum class then we use Enum source
	// It is a class, that represents group of constants
	// final variable : values dont change
	// access the item in an iteratable way
	
	enum Values{
		Selenium, Jmeter, Junit   // values of type Enum
	}
	
	@ParameterizedTest(name = "Enum Value {arguments}")
	@EnumSource(Values.class)
	public void passvaluesEnumSource(Object value)
	{
		// Returns a string representation of the object
		System.out.println(value.toString());
	}

}
