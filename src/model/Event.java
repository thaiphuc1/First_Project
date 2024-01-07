/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author thaip
 */
public class Event {
    private String nameEvent;
    private LocalDate date;

    public Event() {
    }

    public Event(String nameEvent, LocalDate date) {
        this.nameEvent = nameEvent;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    @Override
    public String toString() {
        return nameEvent + " : " + date;
    }
    
}
