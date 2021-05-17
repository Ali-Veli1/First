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
public class InstructorManager extends UserManager {
        @Override
        public void addUser(User user){
        System.out.println(user.getFirstName() +  " " + user.getLastName() + " Egitmen kaydi yapildi ");
    }
    
        @Override
        public void deleteUser(User user){
        System.out.println(user.getFirstName() +  " " + user.getLastName() + " Egitmen kaydi silindi ");
    }
        
        @Override
        public void login(User user){
        System.out.println("Egitmen " + user.getFirstName() +  " " + user.getLastName() + " giris yapti");
    }
    
        @Override
        public void logout(User user){
        System.out.println("Egitmen " + user.getFirstName() +  " " + user.getLastName() + " cikis yapti");
    }
}
