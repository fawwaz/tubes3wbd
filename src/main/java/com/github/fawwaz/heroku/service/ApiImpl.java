/**
 * 
 */
package com.github.fawwaz.heroku.service;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.github.fawwaz.heroku.model.User;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author chamerling
 * 
 */
public class ApiImpl implements Api {
    
    public final static String FBase_URL = "https://vivid-heat-3397.firebaseio.com/";
    public final static String FBase_Users_URL = "https://vivid-heat-3397.firebaseio.com/Users";
    public final static String FBase_Posts_URL = "https://vivid-heat-3397.firebaseio.com/Posts";
    
    private boolean status;
    
    @Override
    public String sayHi(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createPost(String title, String content, String date, String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean readPost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatePost(String title, String content, String date, String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePost(String id_post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean publishPost(String id_post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean searchPost(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createUser(String username, String email, String password, String role) throws InterruptedException  {
        Firebase firebase = new Firebase("https://vivid-heat-3397.firebaseio.com/");
        Firebase userref = firebase.child("Users");
        
        User user = new User(username, password, email, role);
        Map<String,Object> userMap = new HashMap<String, Object>();
        userMap.put("username",username);
        userMap.put("email",email);
        userMap.put("role",role);
        userMap.put("password",password);
        status = false;
        
        final CountDownLatch done = new CountDownLatch(1);
        userref.child(username).setValue(userMap,new Firebase.CompletionListener() {

            @Override
            public void onComplete(FirebaseError fe, Firebase frbs) {
                status = true;
                done.countDown();
            }
        });
        
        done.await();
        userref.child(username).setValue(user);
        return status;   
    }

    @Override
    public boolean readUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateUser(String username, String email, String password, String role){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean createComment(String username, String email, String date, String content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean readComment(Integer id_post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteComment(Integer id_comment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}