package com.kovalchv;

import com.kovalchv.interfaces.Observer;
import com.kovalchv.model.EmailTopic;
import com.kovalchv.model.EmailTopicSubscriber;

public class Main {

    public static void main(String... args) {
        EmailTopic topic = new EmailTopic();

        //create observer
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        //Register them...
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //Check for updates
        firstObserver.update();
        thirdObserver.update();

        //Provider or Subject(broadcaster)
        topic.postMessage("Hello subs");

    }

}
