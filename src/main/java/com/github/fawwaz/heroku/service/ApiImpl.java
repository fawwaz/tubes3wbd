/**
 * 
 */
package com.github.fawwaz.heroku.service;

/**
 * @author chamerling
 * 
 */
public class ApiImpl implements Api {

	@Override
	public String sayHi(String input) {
		System.out.println("Hello invoked : " + input);
		return String.format("Hello '%s'", input);
	}

}
