package com.design.pattern.observor;

//The observer pattern defines a one-to-many dependency between objects so that when one object changes state,
//all of its dependents are notified and updated automatically.
//The object which is being watched is called the subject.
//The objects which are watching the state changes are called observers or listeners.

public class Youtube {
    public static void main(String[] args) {
        Subject telusko = new Channel();

        Observor s1 = new Subscriber("Rudy");
        Observor s2 = new Subscriber("Phil");
        Subscriber s3 = new Subscriber("Patrick");
        Observor s4 = new Subscriber("Alex");
        Observor s5 = new Subscriber("Adrain");

        telusko.subscribe(s1);
        s1.subscribeChannel(telusko);

        telusko.subscribe(s2);
        s2.subscribeChannel(telusko);

        telusko.subscribe(s3);
        s3.subscribeChannel(telusko);

        telusko.subscribe(s4);
        s4.subscribeChannel(telusko);

        telusko.subscribe(s5);
        s5.subscribeChannel(telusko);

        telusko.upload("How to learn Programming!");

        telusko.unSubscribe(s3);


        telusko.upload("How to Unsubscribe ;)");

    }
}
