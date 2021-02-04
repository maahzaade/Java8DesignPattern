package com.design.pattern.observor;

public interface Subject {
    void subscribe(Observor sub);

    void unSubscribe(Subscriber sub);

    void notifySubscriber(String title);

    void upload(String title);
}
