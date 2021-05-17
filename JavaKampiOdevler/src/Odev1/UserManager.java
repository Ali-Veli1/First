/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odev1;

/**
 *
 * @author User
 */
public class UserManager {
    public void addUser(User user){
        System.out.println(user.getFirstName()+ " " +  user.getLastName() + " kaydi yapildi");
    }
    
    public void deleteUser(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " kaydi silindi");
    }
    
    public void login(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " giris yapti");
    }
    
    public void logout(User user){
        System.out.println(user.getFirstName() +  " " + user.getLastName() + " cikis yapti");
    }
    
    public void addMultiple(User[] users){
        for(User user : users){
            addUser(user);
            
    }
}
}
