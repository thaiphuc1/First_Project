/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_controller;

import View.Menu;
import java.util.Scanner;
import model.Bank;
import model.BankManagement;
/**
 *
 * @author thaip
 */
public class BankMain extends Menu{
    private static String[] ch = {"Sign Up", "Login","Forgot password", "Exit"};
    private BankManagement list = new BankManagement();
    private Bank b = new Bank();
    public BankMain(){
        super("Bank Management System", ch);
    }
    
    public static void main(String[] args) {
        new BankMain().run();
    }
   
    @Override
    public void execute(int ch) {
        switch(ch) {
            case 1: signUp(); break;
            case 2: dologIn(); break;
            case 3 : doForgot(); break;
            case 4: System.exit(0);
        }
    }
    
    public void signUp() {
        String name = Menu.getString("Enter Name: "); 
        b.setName(name);
        String id = Menu.getString("Enter AccountID: ");
        b.setPersonID(id);
        String pass = Menu.getString("Enter Password: ");
       if(pass.isEmpty()) {
           System.out.println("Please enter again!");
           signUp();
       }else{
           
     
       list.signUp(name, id, pass);
       }
    }
    
    public void dologIn(){
        String id = Menu.getString("Enter AccountID: ");
              
        String pass = Menu.getString("Enter Password: ");
        boolean check = list.logIn(id, pass);
        if(check){
            done();
        }
        else{
            System.out.println("Log in failed!");
        }
    }
    public void done() {
        String[] mcs={"Deposite", "With Draw", "Update my age","Remove my account"};
        Menu smenu= new Menu("Pick your choice : ",mcs){
            @Override
            public void execute(int ch) {
                switch(ch) {
                    case 1: deposite(); break;
                    case 2: withdraw(); break;
                    case 3: doupdate(); break;
                    case 4 :doRemove(); break;
        }
            }
            
        };
        smenu.run();
    }
    
    public void doupdate(){
        b.updateIn();
    }
    
    public void doForgot(){
        String id = Menu.getString("Enter user name : ");
        String name = Menu.getString("Enter your name : ");
        list.forgot(name, id);
        
    }
    
    
    public void deposite(){
        double money = Double.parseDouble(Menu.getString("Enter your money"));
        b.deposite(money);
        System.out.println(b.toString());
    }
   
    public void withdraw(){
        double money = Double.parseDouble(Menu.getString("Enter your money"));
            b.withDraw(money);
         System.out.println(b.toString());
    }
    
    public void doRemove(){
        String name = Menu.getString("Enter your name");
        String pass = Menu.getString("Enter your password verify");
        
        list.removeAcc(name, pass);
        new BankMain().run();
    }
    
}
