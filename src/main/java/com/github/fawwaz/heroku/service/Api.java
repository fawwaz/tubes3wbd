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
        
        
        boolean createPost(String title,String content,String date,String username);
        boolean readPost();
        boolean updatePost(String title,String content,String date,String username);
        boolean deletePost(String id_post);
        boolean publishPost(String id_post);
        boolean searchPost(String query);
        
        
        boolean createUser(String username,String email,String password,String role) throws InterruptedException;
        boolean readUser();
        boolean updateUser(String username,String email,String password,String role);
        boolean deleteUser(String username);
        
        boolean createComment(String username,String email,String date,String content);
        boolean readComment(Integer id_post);
        boolean deleteComment(Integer id_comment);
        
        
}
