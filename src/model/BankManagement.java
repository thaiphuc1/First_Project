/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thaip
 */
public class BankManagement extends ArrayList<Bank>{
    Scanner sc = new Scanner(System.in);
   public void signUp(String name, String userName, String password){
       
       this.add(new Bank(name, userName, password));

       System.out.println("Sign Up Successfully!");
   }
    public boolean logIn(String username, String password){
        for (Bank log : this) {
            if(username.equals(log.getPersonID()) && password.equals(log.getPassword())){
                System.out.println("Log in Successfully");
                return  true;
   
            }
        }
        return false;
    }
    public void removeAcc(String name,String password){
        for (int i = 0; i < this.size(); i++) {
           if(this.get(i).getName().equals(name) && this.get(i).getPassword().equals(password)) {
               this.remove(i);
               System.out.println("Remove successfully!");
               
           }
            
        }
    }
    
    
    
    
    
    
    public void forgot(String name, String userName){
        for (Bank b : this) {
            if(b.getName().equals(name)&& b.getPersonID().equals(userName)){
                System.out.println("Please enter new password : ");
                String newPass = sc.next();
                b.setPassword(newPass);
                
               
            }
            else{
                System.out.println("Wrong information!");
            }
        }
    }
    
    
    
}
