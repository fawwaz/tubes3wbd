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
        
        
        boolean createPost(String title,String content,String date);
        boolean readPost();
        boolean updatePost(Integer id,String judul,String content,String date);
        boolean deletePost(Integer id);
        boolean publishPost(Integer id);
        boolean searchPost(String query);
        
        
        boolean createUser(String name,String email,String role);
        boolean readUser();
        boolean updateUser(Integer id,String nama,String role,String email);
        boolean deleteUser(Integer id);
        
        boolean createComment(Integer id_post,String name,String email,String content);
        boolean readComment(Integer id_post);
        boolean deleteComment(Integer id_comment);
        
        
}
