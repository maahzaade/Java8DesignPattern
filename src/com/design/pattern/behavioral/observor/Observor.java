package com.design.pattern.behavioral.observor;

public interface Observor {
    void update(String title);

    void subscribeChannel(Subject ch);
}
