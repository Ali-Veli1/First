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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User user = new User();
        
        
        
        
        Student student1 = new Student();
        student1.setFirstName("Ali");
        student1.setLastName("Veli");
        
        
        
        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("Ahmet");
        instructor1.setLastName("Selim");
        
        UserManager userManager = new UserManager();
        
        
        StudentManager studentManager = new StudentManager();
        studentManager.addUser(student1);
        studentManager.login(student1);
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addUser(instructor1);
        instructorManager.login(instructor1);

        
        User[] users = {student1,instructor1};
        userManager.addMultiple(users);
                
                
 }
    
}
