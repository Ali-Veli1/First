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
public class StudentManager extends UserManager {
        @Override
        public void addUser(User user){
            System.out.println(user.getFirstName() +  " " + user.getLastName() + " Ogenci kaydi eklendi");
    }
        @Override
            public void deleteUser(User user){
            System.out.println(user.getFirstName() +  " " + user.getLastName() +" Ogrenci kaydi silindi");
    }
            
        @Override
        public void login(User user){
        System.out.println("Ogrenci " + user.getFirstName() +  " " + user.getLastName() + " giris yapti");
    }
    
        @Override
        public void logout(User user){
        System.out.println("Ogrenci " + user.getFirstName() +  " " + user.getLastName() + "Ogrenci cikisi yapildid");
    }
}
