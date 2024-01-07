/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author thaip
 */
public class AddEvent extends ArrayList<Event>{
    public void addEvent(String eventName) {
        LocalDate currentDate = LocalDate.now();
        Event event = new Event(eventName, currentDate);
        this.add(event);
        System.out.println("Event added: " + event);
    }
}
