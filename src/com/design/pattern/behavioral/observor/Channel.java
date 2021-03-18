package com.design.pattern.behavioral.observor;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Observor> subs = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Observor sub){
        subs.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub){
        System.out.println(sub.getName() +" has unsubscribed!");
        subs.remove(sub);
    }

    @Override
    public void notifySubscriber(String title){
        subs.forEach(p -> p.update(title));
    }

    @Override
    public void upload(String title){
        this.title = title;
        notifySubscriber(title);
    }

}
