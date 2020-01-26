package com.kovalchv.model;

import com.kovalchv.interfaces.Observer;
import com.kovalchv.interfaces.Subject;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {

    private List<Observer> observers;
    private String message;

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(@NonNull Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(@NonNull Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(@NonNull Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to my topic : " + message);
        this.message = message;
        notifyObservers();
    }

}
