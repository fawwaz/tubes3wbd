/**
 * 
 */
package com.github.fawwaz.heroku.service;

import javax.jws.WebService;

/**
 * @author chamerling
 * 
 */
@WebService
public interface Api {

	String sayHi(String input);
}
