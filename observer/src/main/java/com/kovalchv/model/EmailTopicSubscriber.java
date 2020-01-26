package com.kovalchv.model;

import com.kovalchv.interfaces.Observer;
import com.kovalchv.interfaces.Subject;
import lombok.NonNull;

import static java.util.Objects.isNull;

public class EmailTopicSubscriber implements Observer {

    private String name;

    //Reference to our Subject class
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if (isNull(message)) {
            System.out.println(name + " No new message on this topic");
        } else {
            System.out.println(name + " Retrieving message: " + message);
        }
    }

    @Override
    public void setSubject(@NonNull Subject subject) {
        topic = subject;
    }

}
