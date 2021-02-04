package com.design.pattern.observor;

public class Subscriber implements Observor {

    private String name;
    private Subject channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("Hey " + name + ",Video named "+videoTitle+" Uploaded..");
    }

    @Override
    public void subscribeChannel(Subject ch) {
        channel = ch;
    }


}
