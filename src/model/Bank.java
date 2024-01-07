/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author thaip
 */
public class Bank {
    private String personID, name;
    private int age;
    private String password;
    private double balance;

    public Bank() {
    }

    public Bank(String personID, String name, int age, String password, double balance) {
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.password = password;
        this.balance = balance;
    }

    public Bank( String name,String personID, String password) {
        this.personID = personID;
        this.name = name;
        this.password = password;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposite(double money){
        this.setBalance(this.getBalance() + money);
    }
    public void withDraw(double money){
        this.setBalance(this.getBalance() - money);
    }
    public void updateIn(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age : ");
                int age = sc.nextInt();
                this.setAge(age);
                System.out.println("Your Information after update : \n"
                        + "Name : " + this.getName()+"\n"
                        + "Age : " + this.getAge());
                System.out.println("Update age successfully!");
            
               
        }
    @Override
    public String toString() {
        return "Bank Account : \n" +  "Name : " + name + "\nAge : " + age + "\nBalance : " + balance ;
    }

    
    
    
    
}
