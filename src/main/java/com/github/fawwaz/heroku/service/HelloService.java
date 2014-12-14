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
public interface HelloService {

	String sayHi(String input);
}
